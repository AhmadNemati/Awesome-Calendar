package com.ahmadnemati.awesomecalendar.layout_manager;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;

/**
 * Created by Ahmad Nemati on 11/26/2016.
 */

public class GridLayoutMnanager extends GridLayoutManager {
    private boolean rtlLayout = false;


    public GridLayoutMnanager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public GridLayoutMnanager(Context context, int spanCount) {
        super(context, spanCount);
    }

    public GridLayoutMnanager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }


    public boolean isRtlLayout() {
        return rtlLayout;
    }

    public void setRtlLayout(boolean rtlLayout) {
        this.rtlLayout = rtlLayout;
        isLayoutRTL();

    }

    @Override
    protected boolean isLayoutRTL() {
        return rtlLayout;
    }
}




