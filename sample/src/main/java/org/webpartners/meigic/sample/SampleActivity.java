package org.webpartners.meigic.sample;

import android.support.v4.app.FragmentTransaction;

import org.webpartners.meigic.sample.fragments.SampleFragment;
import org.webpartners.meigic.views.MeigicActivity;

/**
 * Project: Meigic sample
 *
 * Created by Jorge Garrido Oval on 1/6/16.
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
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_placeholder, new SampleFragment(), "sample_fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}