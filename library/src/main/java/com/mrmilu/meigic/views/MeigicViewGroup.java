package com.mrmilu.meigic.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.mrmilu.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic
 *
 * Created on 20/5/16.
 * Copyright © MrMilu 2016
 */
public abstract class MeigicViewGroup<P extends MeigicPresenter, V extends MeigicView> extends FrameLayout {

    protected P presenter;

    public MeigicViewGroup(Context context) {
        super(context);
        presenter = this.initPresenter();
        this.initView();
    }

    public MeigicViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        presenter = this.initPresenter();
        this.initView();
    }

    public MeigicViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        presenter = this.initPresenter();
        this.initView();
    }

    @Override protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        presenter.setup();
    }

    @Override protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (presenter != null) {
            presenter.destroy();
        }
    }

    protected abstract P initPresenter();

    protected abstract void initView();
}
