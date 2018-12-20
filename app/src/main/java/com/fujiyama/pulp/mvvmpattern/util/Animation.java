package com.fujiyama.pulp.mvvmpattern.util;

import android.view.View;
import android.view.animation.ScaleAnimation;

public class Animation {

        private Animation() {
            // restricts public initialization of class
        }

        public static void scaleAnimateView(View view) {
            ScaleAnimation animation =
                    new ScaleAnimation(
                            1.15f, 1, 1.15f, 1,
                            android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f,
                            android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f);

            view.setAnimation(animation);
            animation.setDuration(100);
            animation.start();
        }
}
