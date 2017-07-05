package com.mrmilu.meigic.sample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.mrmilu.meigic.sample.R;
import com.mrmilu.meigic.sample.helpers.SampleHelper;
import com.mrmilu.meigic.views.MeigicFragment;
import com.mrmilu.meigic.sample.views.SampleFrame;

/**
 * Project: Meigic sample
 *
 * Created on 1/6/16.
 * Copyright © MrMilu 2016
 */
public class SampleFragment
        extends MeigicFragment<SampleFragmentPresenter, SampleFragmentView>
        implements SampleFragmentView{

    @Override protected SampleFragmentPresenter initPresenter() {
        return new SampleFragmentPresenter(this);
    }

    @Override protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final LinearLayout view = (LinearLayout) inflater.inflate(R.layout.sample_fragment_view, container, false);

        new SampleHelper(getContext(), view).loadChild(new SampleFrame(getContext()));

        return view;
    }
}
