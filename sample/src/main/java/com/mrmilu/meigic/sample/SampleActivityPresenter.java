package com.mrmilu.meigic.sample;

import com.mrmilu.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic sample
 *
 * Created on 1/6/16.
 * Copyright © MrMilu 2016
 */
public class SampleActivityPresenter extends MeigicPresenter<SampleActivityView> {

    public SampleActivityPresenter(SampleActivityView view) {
        super(view);
    }

    @Override public void setup() {
        // Presenter init here
    }

    @Override public void destroy() {
        // Presenter destroy here
    }
}