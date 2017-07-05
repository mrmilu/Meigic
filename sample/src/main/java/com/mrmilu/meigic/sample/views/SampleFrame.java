package com.mrmilu.meigic.sample.views;

import android.content.Context;
import android.util.AttributeSet;

import com.mrmilu.meigic.sample.R;
import com.mrmilu.meigic.views.MeigicViewGroup;

/**
 * Project: Meigic sample
 *
 * Created on 1/6/16.
 * Copyright © MrMilu 2016
 */
public class SampleFrame
        extends MeigicViewGroup<SampleFramePresenter, SampleFrameView>
        implements SampleFrameView {


    public SampleFrame(Context context) {
        super(context);
    }

    public SampleFrame(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SampleFrame(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override protected SampleFramePresenter initPresenter() {
        return new SampleFramePresenter(this);
    }

    @Override protected void initView() {
        inflate(getContext(), R.layout.sample_frame_view, this);
    }
}
