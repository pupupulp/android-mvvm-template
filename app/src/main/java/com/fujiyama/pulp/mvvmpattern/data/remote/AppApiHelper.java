package com.fujiyama.pulp.mvvmpattern.data.remote;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppApiHelper implements IApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        this.mApiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }
}
