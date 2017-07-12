package com.example.tybee.james2017summer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tybee.james2017summer.BaseActivity;
import com.example.tybee.james2017summer.Fragment.BlueFragment;
import com.example.tybee.james2017summer.Fragment.GreenFragment;
import com.example.tybee.james2017summer.Fragment.RedFragment;
import com.example.tybee.james2017summer.adapter.AdvancedListViewAdapter;
import com.example.tybee.james2017summer.adapter.BaseViewPagerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends AppCompatActivity {

    @BindView(R.id.activity_advanced_list_view) ListView lv;
    private ViewPager viewPager;
    private ArrayList<Fragment> list2 = new ArrayList<Fragment>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);

        viewPager= (ViewPager)findViewById(R.id.activity_view_pager2);
        list2.add(new RedFragment());
        list2.add(new BlueFragment());
        list2.add(new GreenFragment());





        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I'm fine, thank you.");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        AdvancedListViewAdapter adapter = new AdvancedListViewAdapter(this, list);
        lv.setAdapter(adapter);




        TextView tv_1 = new TextView(this);
        tv_1.setText("FooterView");
        tv_1.setTextSize(50);
        lv.addFooterView(tv_1);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });

    }
}