package org.webpartners.meigic.sample.views;

import android.content.Context;
import android.util.AttributeSet;

import org.webpartners.meigic.sample.R;
import org.webpartners.meigic.views.MeigicViewGroup;

/**
 * Project: Meigic sample
 *
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
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
