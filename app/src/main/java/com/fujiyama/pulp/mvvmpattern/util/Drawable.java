package com.fujiyama.pulp.mvvmpattern.util;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;

import com.fujiyama.pulp.mvvmpattern.R;

public class Drawable {

    private Drawable() {
        // restricts public initialization of class
    }

    public static void changeIconDrawableToGray(Context context, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(ContextCompat.getColor(context, R.color.darkGray), PorterDuff.Mode.SRC_ATOP);
        }
    }
}
