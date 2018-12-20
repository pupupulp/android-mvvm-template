package com.fujiyama.pulp.mvvmpattern.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class PlayStore {

    private PlayStore() {
        // restricts public initialization of class
    }

    public static void openPlayStoreForApp(Context context) {
        final String appPackageName = context.getPackageName();

        final String shortUrl = "market://details?id=";
        final String fullUrl = "https://play.google.com/store/apps/details?id=";

        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(shortUrl + appPackageName)));
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(fullUrl + appPackageName)));
        }
    }
}
