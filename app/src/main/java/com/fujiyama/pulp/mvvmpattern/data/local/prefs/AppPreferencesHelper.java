package com.fujiyama.pulp.mvvmpattern.data.local.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.fujiyama.pulp.mvvmpattern.di.IPreferencesInfo;

import javax.inject.Inject;


public class AppPreferencesHelper implements IPreferencesHelper {

    private final SharedPreferences mSharedPreferences;

    @Inject
    public AppPreferencesHelper(Context context, @IPreferencesInfo String preferencesName) {
        mSharedPreferences = context.getSharedPreferences(preferencesName, Context.MODE_PRIVATE);
    }
}
