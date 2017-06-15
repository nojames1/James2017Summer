package com.example.tybee.james2017summer;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tybee.james2017summer.Fragment.BlueFragment;
import com.example.tybee.james2017summer.Fragment.GreenFragment;
import com.example.tybee.james2017summer.Fragment.RedFragment;
import com.example.tybee.james2017summer.adapter.BaseViewPagerAdapter;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        Toast.makeText(this, "onCreaate", Toast.LENGTH_SHORT).show();
        viewPager= (ViewPager)findViewById(R.id.activity_view_pager);
        list.add( new RedFragment());
        list.add(new BlueFragment());
        list.add(new GreenFragment());
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
        viewPager.setNestedScrollingEnabled(true);

    }
}
