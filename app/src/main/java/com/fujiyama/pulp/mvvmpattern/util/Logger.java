package com.fujiyama.pulp.mvvmpattern.util;


import com.fujiyama.pulp.mvvmpattern.BuildConfig;

import timber.log.Timber;

public class Logger {

    private Logger() {
        // restricts public initialization of class
    }

    public static void d(String s, Object... objects) {
        Timber.d(s, objects);
    }

    public static void d(Throwable t, String s, Object... objects) {
        Timber.d(t, s, objects);
    }

    public static void e(String s, Object... objects) {
        Timber.e(s, objects);
    }

    public static void e(Throwable t, String s, Object... objects) {
        Timber.e(t, s, objects);
    }

    public static void i(String s, Object... objects) {
        Timber.i(s, objects);
    }

    public static void i(Throwable t, String s, Object... objects) {
        Timber.i(t, s, objects);
    }

    public static void w(String s, Object... objects) {
        Timber.i(s, objects);
    }

    public static void w(Throwable t, String s, Object... objects) {
        Timber.i(t, s, objects);
    }

    public static void init() {
        if(BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
