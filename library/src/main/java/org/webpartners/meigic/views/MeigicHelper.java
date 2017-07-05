package org.webpartners.meigic.views;

import android.content.Context;
import android.view.View;

/**
 * Project: Meigic
 *
 * Created on 24/10/16.
 * Copyright © Mr.Milú 2016
 */
public class MeigicHelper {

    protected Context context;
    protected View view;

    public MeigicHelper(Context context) {
        this.context = context;
    }

    public MeigicHelper(View view) {
        this.view = view;
    }

    public MeigicHelper(Context context, View view) {
        this.context = context;
        this.view = view;
    }
}
