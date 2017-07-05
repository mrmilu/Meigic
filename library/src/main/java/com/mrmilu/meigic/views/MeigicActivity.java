package com.mrmilu.meigic.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mrmilu.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic
 *
 * Created on 20/5/16.
 * Copyright © MrMilu 2016
 */
public abstract class MeigicActivity<P extends MeigicPresenter, V extends MeigicView> extends AppCompatActivity {

    protected P presenter;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initView();
        presenter = this.initPresenter();
        presenter.setup();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.destroy();
        }
        presenter = null;
    }

    protected abstract P initPresenter();

    protected abstract void initView();
}
