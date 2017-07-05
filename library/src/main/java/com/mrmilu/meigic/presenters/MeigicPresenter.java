package com.mrmilu.meigic.presenters;

import com.mrmilu.meigic.views.MeigicView;

/**
 * Project: Meigic
 *
 * Created on 20/5/16.
 * Copyright © MrMilu 2016
 */
public abstract class MeigicPresenter<V extends MeigicView> {

    protected V view;

    public MeigicPresenter(V view) {
        this.view = view;
    }

    public abstract void setup();

    public abstract void destroy();
}
