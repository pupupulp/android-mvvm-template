package com.fujiyama.pulp.mvvmpattern.di.module;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.fujiyama.pulp.mvvmpattern.data.local.prefs.AppPreferencesHelper;
import com.fujiyama.pulp.mvvmpattern.data.local.prefs.IPreferencesHelper;
import com.fujiyama.pulp.mvvmpattern.data.local.db.AppDatabase;
import com.fujiyama.pulp.mvvmpattern.data.local.db.AppDatabaseHelper;
import com.fujiyama.pulp.mvvmpattern.data.local.db.IDatabaseHelper;
import com.fujiyama.pulp.mvvmpattern.data.manager.IDataManager;
import com.fujiyama.pulp.mvvmpattern.data.manager.LoginManager;
import com.fujiyama.pulp.mvvmpattern.data.remote.ApiHeader;
import com.fujiyama.pulp.mvvmpattern.data.remote.AppApiHelper;
import com.fujiyama.pulp.mvvmpattern.data.remote.IApiHelper;
import com.fujiyama.pulp.mvvmpattern.di.IApiInfo;
import com.fujiyama.pulp.mvvmpattern.di.IDatabaseInfo;
import com.fujiyama.pulp.mvvmpattern.di.IPreferencesInfo;
import com.fujiyama.pulp.mvvmpattern.util.Constant;
import com.fujiyama.pulp.mvvmpattern.util.rx.AppSchedulerProvider;
import com.fujiyama.pulp.mvvmpattern.util.rx.ISchedulerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    /**
     * Application Context
     */
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    /**
     * Gson
     */
    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    /**
     * App Database
     */
    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@IDatabaseInfo String databaseName, Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, databaseName)
                .fallbackToDestructiveMigration()
                .build();
    }

    /**
     * Data Manager
     */
    @Provides
    @Singleton
    IDataManager provideDataManager(LoginManager loginManager) {
        return loginManager;
    }

    /**
     * Database Helper
     */
    @Provides
    @Singleton
    IDatabaseHelper provideDbHelper(AppDatabaseHelper appDatabaseHelper) {
        return appDatabaseHelper;
    }

    /**
     * Api Helper
     */
    @Provides
    @Singleton
    IApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    /**
     * Preferences Helper
     */
    @Provides
    @Singleton
    IPreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    /**
     * Api Info
     */
    @Provides
    @IApiInfo
    String provideApiKey() {
        return "";
    }

    /**
     * Database Info
     */
    @Provides
    @IDatabaseInfo
    String provideDatabaseName() {
        return "";
    }

    /**
     * Preferences Info
     */
    @Provides
    @IPreferencesInfo
    String providePreferencesName() {
        return Constant.PREF_NAME;
    }

    /**
     * Api Header
     */
    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@IApiInfo String apiKey, IPreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader();
    }

    /**
     * Scheduler Provider
     */
    @Provides
    ISchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}

