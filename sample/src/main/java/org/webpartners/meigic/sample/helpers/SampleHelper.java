package org.webpartners.meigic.sample.helpers;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import org.webpartners.meigic.sample.R;
import org.webpartners.meigic.sample.fragments.SampleFragment;
import org.webpartners.meigic.views.MeigicHelper;

/**
 * Project: Meigic
 *
 * Created by Jorge Garrido Oval on 24/10/16.
 * Copyright © Mr.Milú 2016
 */

public class SampleHelper extends MeigicHelper {

    public SampleHelper(Context context, View view) {
        super(context, view);
    }

    public void loadChild() {
        ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_placeholder, new SampleFragment(), "sample_fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    public void loadChild(View childView) {
        ((ViewGroup) view).addView(childView);
    }
}
