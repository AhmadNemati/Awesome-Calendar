package com.ahmadnemati.awesomecalendar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ahmad Nemati on 11/23/2016.
 */

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
