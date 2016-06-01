package org.webpartners.meigic.sample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.webpartners.meigic.sample.R;
import org.webpartners.meigic.sample.views.SampleFrame;
import org.webpartners.meigic.views.MeigicFragment;

/**
 * Project: Meigic sample
 *
 * Created by Jorge Garrido Oval on 1/6/16.
 * Copyright © Webpartners 2016
 */
public class SampleFragment
        extends MeigicFragment<SampleFragmentPresenter, SampleFragmentView>
        implements SampleFragmentView{

    @Override protected SampleFragmentPresenter initPresenter() {
        return new SampleFragmentPresenter(this);
    }

    @Override protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final LinearLayout view = (LinearLayout) inflater.inflate(R.layout.sample_fragment_view, container, false);

        view.addView(new SampleFrame(getContext()));

        return view;
    }
}
