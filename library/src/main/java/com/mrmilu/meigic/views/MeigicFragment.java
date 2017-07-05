package com.mrmilu.meigic.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mrmilu.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic
 *
 * Created on 20/5/16.
 * Copyright © MrMilu 2016
 */
public abstract class MeigicFragment<P extends MeigicPresenter, V extends MeigicView> extends Fragment {

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
        if (presenter != null) {
            presenter.destroy();
        }
    }

    @Override public void onDestroy() {
        super.onDestroy();
        presenter = null;
    }

    protected abstract P initPresenter();

    protected abstract View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
}
