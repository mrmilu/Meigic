package org.webpartners.meigic.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.webpartners.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic
 *
 * Created by Jorge Garrido Oval on 26/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicDialog<P extends MeigicPresenter, V extends MeigicView> extends DialogFragment {

    protected P presenter;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = this.initPresenter();
    }

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return this.initView(inflater, container, savedInstanceState);
    }

    @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter.setup();
    }

    @Override public void onDetach() {
        super.onDetach();
        presenter.destroy();
    }

    protected abstract P initPresenter();

    protected abstract View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
}
