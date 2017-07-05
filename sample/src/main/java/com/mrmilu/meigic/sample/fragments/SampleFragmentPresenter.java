package com.mrmilu.meigic.sample.fragments;

import com.mrmilu.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic sample
 *
 * Created on 1/6/16.
 * Copyright © MrMilu 2016
 */
public class SampleFragmentPresenter extends MeigicPresenter<SampleFragmentView> {

    public SampleFragmentPresenter(SampleFragmentView view) {
        super(view);
    }

    @Override public void setup() {
        // Presenter init here
    }


    @Override public void destroy() {
        // Presenter destroy here
    }
}
