package com.fujiyama.pulp.mvvmpattern.ui.login;

import com.fujiyama.pulp.mvvmpattern.data.manager.IDataManager;
import com.fujiyama.pulp.mvvmpattern.util.rx.ISchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    LoginViewModel provideLoginViewModel(IDataManager dataManager, ISchedulerProvider schedulerProvider) {
        return new LoginViewModel(dataManager, schedulerProvider);
    }
}
