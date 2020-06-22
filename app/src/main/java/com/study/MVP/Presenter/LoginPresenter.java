package com.study.MVP.Presenter;

import com.study.MVP.Bean.UserBean;
import com.study.MVP.Model.UserModel;
import com.study.MVP.Model.UserModelImpl;
import com.study.MVP.Model.OnLoginListener;
import com.study.MVP.View.LoginView;

public class LoginPresenter implements OnLoginListener {
    UserModel mModelUser;
    LoginView mLoginView;

    public LoginPresenter(LoginView loginView) {
        mModelUser = new UserModelImpl();
        this.mLoginView = loginView;
    }

    public void login() {
        mModelUser.login(mLoginView.getUsername(), mLoginView.getPassword(), this);
    }


    @Override
    public void success(UserBean userBean) {
        mLoginView.loginSuccess();
    }

    @Override
    public void failure() {
        mLoginView.loginFailure();
    }
}
