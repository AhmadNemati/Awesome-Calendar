package com.ahmadnemati.awesomecalendar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmadnemati.awesomecalendar.R;
import com.ahmadnemati.awesomecalendar.entity.ConfigEntity;

/**
 * Created by Ahmad Nemati on 11/23/2016.
 */

public class MonthFragment extends Fragment {
    private View view;
    private ConfigEntity config;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.month_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();

    }

    public static MonthFragment newInstance(ConfigEntity config) {
        Bundle args = new Bundle();
        MonthFragment fragment = new MonthFragment();
        fragment.setArguments(args);
        fragment.config=config;
        return fragment;
    }

    private void init() {

    }
}
