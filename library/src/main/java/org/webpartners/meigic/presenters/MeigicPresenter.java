package org.webpartners.meigic.presenters;

import org.webpartners.meigic.views.MeigicView;

/**
 * Project: Meigic
 *
 * Created by Jorge Garrido Oval on 20/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicPresenter<V extends MeigicView> {

    protected V view;

    public MeigicPresenter(V view) {
        this.view = view;
    }

    public abstract void setup();

    public abstract void destroy();
}
