package com.example.tybee.james2017summer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tybee.james2017summer.Fragment.DemoFragment;
import com.example.tybee.james2017summer.Fragment.WorkFragment;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        setListener();
        ButterKnife.bind(this);

    }

    private void setListener() {
       final WorkFragment workFragment = new WorkFragment();
       final DemoFragment demoFragment = new DemoFragment();

        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_work.setTextColor(Color.BLACK);
                tv_demo.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,demoFragment).commit();
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), QuizTwoActivity.class);
                startActivity(i);

            }
        };
        tv_work.setOnClickListener(listener);
    }
    public void login(View v){
        Toast.makeText(this,"you clicked login",Toast.LENGTH_SHORT).show();

    }
    private void initialView() {
        tv_demo = (TextView)findViewById(R.id.activity_tool_Demo);
        tv_work = (TextView)findViewById(R.id.activity_tool_Work);

    }
}
