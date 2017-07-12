package com.example.tybee.james2017summer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RunnableHandlerActivity extends AppCompatActivity {


    private View.OnClickListener startListener, stopListener, resetListener;
    @BindView(R.id.activity_handler_runnable_et)
    EditText editText;
    @BindView(R.id.activity_handler_runnable_btn)
    Button btn;

    Handler handler = new Handler();
    private int time = 0;
    Runnable runnable = new Runnable(){
        public void run(){
            time--;
            if(time>=0){
                editText.setText(String.valueOf(time));
                handler.postDelayed(runnable,1000);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runnable_handler);
        ButterKnife.bind(this);

        startListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                btn.setText("Stop");
                editText.setEnabled(false);
                btn.setOnClickListener(stopListener);
                time= Integer.valueOf(editText.getText().toString());


            }
        };
        stopListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                btn.setText("Reset");
                btn.setOnClickListener(resetListener);
            handler.removeCallbacks(runnable);
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
}
