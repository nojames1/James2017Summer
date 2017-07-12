package com.example.tybee.james2017summer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tybee.james2017summer.Service.PastService;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ServiceActivity extends AppCompatActivity {

    @BindView(R.id.service_tv)
    TextView tv;
    @OnClick(R.id.service_bt)
    public void startService(View view){
        Intent intent = new Intent(this, PastService.class);
    intent.putExtra("key","start");
        startService(intent);
        registerBroadcast();
    }

    private void registerBroadcast() {
        TestReciever testReciever = new TestReciever();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        ButterKnife.bind(this);
    }

   public class TestReciever extends BroadcastReceiver{


        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(action.equals(PastService.ACTION)){
                int update = intent.getIntExtra("update", 0);
                tv.setText(String.valueOf(update));
            }
        }
}
}