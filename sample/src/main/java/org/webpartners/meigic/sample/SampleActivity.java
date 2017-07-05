package org.webpartners.meigic.sample;

import org.webpartners.meigic.sample.helpers.SampleHelper;
import org.webpartners.meigic.views.MeigicActivity;

/**
 * Project: Meigic sample
 *
 * Created on 1/6/16.
 * Copyright © Webpartners 2016
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