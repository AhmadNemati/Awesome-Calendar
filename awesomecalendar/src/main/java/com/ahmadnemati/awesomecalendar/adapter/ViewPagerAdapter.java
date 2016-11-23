package com.ahmadnemati.awesomecalendar.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import com.ahmadnemati.awesomecalendar.entity.ConfigEntity;
import com.ahmadnemati.awesomecalendar.fragment.MonthFragment;

/**
 * Created by Ahmad Nemati on 11/23/2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private ConfigEntity configEntity;


    public ViewPagerAdapter(FragmentManager fm,ConfigEntity configEntity) {
        super(fm);
        this.configEntity=configEntity;

    }


    @Override
    public Fragment getItem(int position) {
        return MonthFragment.newInstance(configEntity);
    }

    @Override
    public int getCount() {
        return configEntity.getMaxPages();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    public void setConfigEntity(ConfigEntity configEntity) {
        this.configEntity = configEntity;
        notifyDataSetChanged();
    }
}
