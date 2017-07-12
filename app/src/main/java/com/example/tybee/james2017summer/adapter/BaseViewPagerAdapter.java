package com.example.tybee.james2017summer.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by tybee on 6/12/2017.
 */

public class BaseViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;
    Context context;

    public BaseViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public BaseViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list){
        super(fm);
        this.list = list;

    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
