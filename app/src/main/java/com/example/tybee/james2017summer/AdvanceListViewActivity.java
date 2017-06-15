package com.example.tybee.james2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tybee.james2017summer.BaseActivity;
import com.example.tybee.james2017summer.adapter.AdvancedListViewAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends AppCompatActivity {

    @BindView(R.id.activity_advanced_list_view) ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I'm fine, thank you.");
        AdvancedListViewAdapter adapter = new AdvancedListViewAdapter(this, list);
        lv.setAdapter(adapter);

        TextView tv = new TextView(this);
        tv.setText("HeaderView");
        tv.setTextSize(50);
        lv.addHeaderView(tv);

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