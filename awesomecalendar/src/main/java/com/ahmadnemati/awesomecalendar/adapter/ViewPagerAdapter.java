package com.ahmadnemati.awesomecalendar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import com.ahmadnemati.awesomecalendar.entity.ConfigEntity;

/**
 * Created by Ahmad Nemati on 11/23/2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private ConfigEntity configEntity;
    private int maxPages;

    public ViewPagerAdapter(FragmentManager fm,ConfigEntity configEntity,int maxPages) {
        super(fm);
        this.configEntity=configEntity;
        this.maxPages=maxPages;
    }


    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return maxPages;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
