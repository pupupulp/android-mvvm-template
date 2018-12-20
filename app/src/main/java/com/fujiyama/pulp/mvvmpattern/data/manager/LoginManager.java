package com.fujiyama.pulp.mvvmpattern.data.manager;

import android.content.Context;

import com.fujiyama.pulp.mvvmpattern.data.local.prefs.IPreferencesHelper;
import com.fujiyama.pulp.mvvmpattern.data.local.db.IDatabaseHelper;
import com.fujiyama.pulp.mvvmpattern.data.remote.ApiHeader;
import com.fujiyama.pulp.mvvmpattern.data.remote.IApiHelper;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LoginManager implements IDataManager {

    private final Context mContext;

    private final IApiHelper mApiHelper;
    private final IDatabaseHelper mDatabaseHelper;
    private final IPreferencesHelper mPreferencesHelper;

    private final Gson mGson;

    @Inject
    public LoginManager(Context context, IApiHelper apiHelper, IDatabaseHelper databaseHelper, IPreferencesHelper preferencesHelper, Gson gson) {
        this.mContext = context;
        this.mApiHelper = apiHelper;
        this.mDatabaseHelper = databaseHelper;
        this.mPreferencesHelper = preferencesHelper;
        this.mGson = gson;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHelper.getApiHeader();
    }
}
