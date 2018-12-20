package com.fujiyama.pulp.mvvmpattern.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.fujiyama.pulp.mvvmpattern.R;
import com.fujiyama.pulp.mvvmpattern.BR;
import com.fujiyama.pulp.mvvmpattern.databinding.ActivityLoginBinding;
import com.fujiyama.pulp.mvvmpattern.di.IDatabaseInfo;
import com.fujiyama.pulp.mvvmpattern.ui.base.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> implements ILoginNavigator {

    @Inject
    LoginViewModel mLoginViewModel;

    @Inject
    @IDatabaseInfo
    String databaseName;

    private ActivityLoginBinding mActivityLoginBinding;

    public static Intent newIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public LoginViewModel getViewModel() {
        return mLoginViewModel;
    }

    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void login() {
        mLoginViewModel.login();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLoginBinding = getViewDataBinding();
        mLoginViewModel.setNavigator(this);
    }
}
