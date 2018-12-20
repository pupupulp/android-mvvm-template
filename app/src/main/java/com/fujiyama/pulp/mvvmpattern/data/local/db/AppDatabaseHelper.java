package com.fujiyama.pulp.mvvmpattern.data.local.db;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDatabaseHelper implements IDatabaseHelper {

    private final AppDatabase mAppDatabase;

    @Inject
    public AppDatabaseHelper(AppDatabase appDatabase) {
        this.mAppDatabase = appDatabase;
    }
}
