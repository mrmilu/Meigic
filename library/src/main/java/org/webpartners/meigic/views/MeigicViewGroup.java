package org.webpartners.meigic.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import org.webpartners.meigic.presenters.MeigicPresenter;

/**
 * Project: Meigic
 *
 * Created by Jorge Garrido Oval on 20/5/16.
 * Copyright © Webpartners 2016
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
        presenter = null;
    }

    protected abstract P initPresenter();

    protected abstract void initView();
}
