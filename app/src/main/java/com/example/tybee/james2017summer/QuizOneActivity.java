package com.example.tybee.james2017summer;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tybee.james2017summer.BaseActivity;
import com.example.tybee.james2017summer.Fragment.BlueFragment;
import com.example.tybee.james2017summer.Fragment.DemoFragment;
import com.example.tybee.james2017summer.Fragment.GreenFragment;
import com.example.tybee.james2017summer.Fragment.RedFragment;
import com.example.tybee.james2017summer.Fragment.WorkFragment;
import com.example.tybee.james2017summer.adapter.BaseViewPagerAdapter;

import java.util.ArrayList;


public class QuizOneActivity extends AppCompatActivity {

    private TextView tv_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

    }



    public void submit(View v){
        Toast.makeText(this,"you clicked submit",Toast.LENGTH_SHORT).show();
    }
}
