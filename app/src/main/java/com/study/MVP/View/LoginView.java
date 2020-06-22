package com.study.MVP.View;

public interface LoginView {
    String getUsername();

    String getPassword();

    void loginSuccess();

    void loginFailure();

    void clear();
}
