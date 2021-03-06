package com.example.tybee.james2017summer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.Pair;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by tybee on 6/19/2017.
 */

public class ViewFragmentStateAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Pair<String , Fragment>> list;

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).first;
    }

    public ViewFragmentStateAdapter(FragmentManager fm, ArrayList<Pair<String, Fragment>> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position).second;
    }


    @Override
    public int getCount() {
        return list.size();
    }

}
