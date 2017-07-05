package com.mrmilu.meigic.sample;

import com.mrmilu.meigic.sample.helpers.SampleHelper;
import com.mrmilu.meigic.views.MeigicActivity;

/**
 * Project: Meigic sample
 *
 * Created on 1/6/16.
 * Copyright © MrMilu 2016
 */
public class SampleActivity
        extends MeigicActivity<SampleActivityPresenter, SampleActivityView>
        implements SampleActivityView {

    @Override protected SampleActivityPresenter initPresenter() {
        return new SampleActivityPresenter(this);
    }

    @Override protected void initView() {
        setContentView(R.layout.sample_activity_view);
        new SampleHelper(this, findViewById(R.id.fragment_placeholder)).loadChild();
    }
}