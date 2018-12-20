package com.fujiyama.pulp.mvvmpattern.di.builder;


import com.fujiyama.pulp.mvvmpattern.ui.login.LoginActivity;
import com.fujiyama.pulp.mvvmpattern.ui.login.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {


    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity bindLoginActivity();
}
