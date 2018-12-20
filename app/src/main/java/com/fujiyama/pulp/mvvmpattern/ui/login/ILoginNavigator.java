package com.fujiyama.pulp.mvvmpattern.ui.login;

public interface ILoginNavigator {

    void handleError(Throwable t);

    void login();
}


