package com.example.tybee.james2017summer;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HandlerActivity extends BaseActivity {


    @BindView(R.id.activity_handler_et)
    EditText editText;
    @BindView(R.id.activity_handler_btn)
    Button btn;

    private final int TIMER = 123;
    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            switch(msg.what){
                case TIMER:
                    Bundle bundle = msg.getData();
                    String s = bundle.getString("msg");
                    shortToast("Message:" + s);
                    int num = Integer.valueOf(editText.getText().toString());
                    editText.setText(String.valueOf(--num));
                    if(num==0){
                        btn.setText("Reset");
                        btn.setOnClickListener(resetListener);
                    }
                    else{
                        thread.run();
                    }
                    break;
                default:
            }
            super.handleMessage(msg);
        }
    };
    private View.OnClickListener startListener, stopListener, resetListener;
    private Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        ButterKnife.bind(this);

            startListener = new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                btn.setText("Stop");
                    editText.setEnabled(false);
                    btn.setOnClickListener(stopListener);

                    startThread();
                }
            };
            stopListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            btn.setText("Reset");
                btn.setOnClickListener(resetListener);
 
            }
        };
         resetListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                btn.setText("Start");
                editText.setEnabled(true);
                btn.setOnClickListener(startListener);

            }
        };
        btn.setOnClickListener(startListener);



    }

    private void startThread() {

        thread = new Thread(new Runnable(){
            @Override
            public void run(){

                try{
                    Thread.sleep(1000);
                    Message msg = new Message();
                    Bundle bundle = new Bundle();
                    bundle.putString("msg","Timer Message");
                    msg.setData(bundle);
                    mHandler.sendMessage(msg);
                    msg.what = TIMER;

                }
                catch(Exception e){e.printStackTrace();}
                
        }
    });
        thread.start();

    }

}
