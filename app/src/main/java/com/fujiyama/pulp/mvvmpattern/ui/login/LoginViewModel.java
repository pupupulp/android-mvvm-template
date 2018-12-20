package com.fujiyama.pulp.mvvmpattern.ui.login;

import com.fujiyama.pulp.mvvmpattern.data.manager.IDataManager;
import com.fujiyama.pulp.mvvmpattern.ui.base.BaseViewModel;
import com.fujiyama.pulp.mvvmpattern.util.rx.ISchedulerProvider;

public class LoginViewModel extends BaseViewModel<ILoginNavigator> {

    public LoginViewModel(IDataManager dataManager, ISchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void login() {
        setIsLoading(true);
        getCompositeDisposable();
    }
}


