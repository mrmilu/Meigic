package org.webpartners.meigic.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.webpartners.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic
 *
 * Created by Jorge Garrido Oval on 20/5/16.
 * Copyright © Webpartners 2016
 */
public abstract class MeigicActivity<P extends MeigicPresenter, V extends MeigicView> extends AppCompatActivity {

    protected P presenter;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initView();
    }

    @Override protected void onStart() {
        super.onStart();
        presenter = this.initPresenter();
        presenter.setup();
    }

    @Override public void onStop() {
        super.onStop();
        if (presenter != null)
            presenter.destroy();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        presenter = null;
    }

    protected abstract P initPresenter();

    protected abstract void initView();
}
