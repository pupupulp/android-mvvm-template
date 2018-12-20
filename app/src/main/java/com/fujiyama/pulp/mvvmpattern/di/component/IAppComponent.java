package com.fujiyama.pulp.mvvmpattern.di.component;

import android.app.Application;

import com.fujiyama.pulp.mvvmpattern.App;
import com.fujiyama.pulp.mvvmpattern.di.builder.ActivityBuilder;
import com.fujiyama.pulp.mvvmpattern.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface IAppComponent {

    void inject(App app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        IAppComponent build();
    }
}
