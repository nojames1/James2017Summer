package com.example.tybee.james2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;

public class ActivityD extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        ButterKnife.bind(this);
        showToast("onCreate");
        Button btnA = (Button) findViewById(R.id.to_a_from_d);
        Button btnB = (Button) findViewById(R.id.to_b_from_d);
        Button btnC = (Button) findViewById(R.id.to_c_from_d);
        Button btnD = (Button) findViewById(R.id.to_d_from_d);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toA();
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toB();
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toC();
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toD();
                showToast("onNewIntent");
            }
        });
    }

    public void toA(){
        Intent intenta;
        intenta = new Intent(this, ActivityA.class);
        startActivity(intenta);
    }
    public void toB(){
        Intent intentb;
        intentb = new Intent(this, ActivityB.class);
        startActivity(intentb);
    }
    public void toC(){
        Intent intentc;
        intentc = new Intent(this, ActivityC.class);
        startActivity(intentc);
    }
    public void toD(){
        Intent intentd;
        intentd = new Intent(this, ActivityD.class);
        startActivity(intentd);
    }
}
