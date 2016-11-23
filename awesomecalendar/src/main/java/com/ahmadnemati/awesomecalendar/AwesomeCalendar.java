package com.ahmadnemati.awesomecalendar;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.ahmadnemati.awesomecalendar.adapter.ViewPagerAdapter;
import com.ahmadnemati.awesomecalendar.entity.ConfigEntity;
import com.ahmadnemati.awesomecalendar.listener.OnDayClickListener;
import com.ahmadnemati.awesomecalendar.listener.OnMonthChangeListener;
import com.ahmadnemati.awesomecalendar.utils.LogLevel;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Ahmad Nemati on 11/23/2016.
 */

public class AwesomeCalendar extends LinearLayout implements ViewPager.OnPageChangeListener {
    private String TAG = AwesomeCalendar.class.getSimpleName();
    private int maxPages = 500;  //default size of view pager
    private ViewPager viewPager;
    private LogLevel logLevel = LogLevel.LEVEL_NONE;
    private OnDayClickListener onDayClickListener;
    private OnMonthChangeListener onMonthChangeListener;
    private ViewPagerAdapter adapter;
    private FragmentManager fm;
    private ConfigEntity config;




    public AwesomeCalendar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AwesomeCalendar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public AwesomeCalendar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {


    //    EventBus.getDefault().register(this);
        initConfig();
        LayoutInflater.from(getContext()).inflate(R.layout.awesome_calendar, this);
        FragmentActivity fragmentActivity = (FragmentActivity) getContext();
        fm = fragmentActivity.getSupportFragmentManager();
        adapter = new ViewPagerAdapter(fm, config);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(maxPages / 2); // Exactly show middle page;
        viewPager.addOnPageChangeListener(this);
        viewPager.setPageMargin(20);

    }

    private void initConfig() {
        config = new ConfigEntity();
        config.setMaxPages(maxPages);
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public ViewPager getViewPager() {
        return viewPager;
    }

    public void setViewPager(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public int getMaxPages() {
        return maxPages;
    }

    public void setMaxPages(int maxPages) {
        this.maxPages = maxPages;
    }

    public OnDayClickListener getOnDayClickListener() {
        return onDayClickListener;
    }

    public void setOnDayClickListener(OnDayClickListener onDayClickListener) {
        this.onDayClickListener = onDayClickListener;
    }

    public OnMonthChangeListener getOnMonthChangeListener() {
        return onMonthChangeListener;
    }

    public void setOnMonthChangeListener(OnMonthChangeListener onMonthChangeListener) {
        this.onMonthChangeListener = onMonthChangeListener;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        if (logLevel == LogLevel.LEVEL_DEBUG)
//            Log.d(TAG, "Position : " + position + " And PositionOffset :" + position);
    }

    @Override
    public void onPageSelected(int position) {
        if (logLevel == LogLevel.LEVEL_DEBUG)
            Log.d(TAG, "Selected Page Position: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (logLevel == LogLevel.LEVEL_DEBUG)
            Log.d(TAG, "ScrollState :" + state);
    }
}
