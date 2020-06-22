package com.study.MVP.Model;

import com.study.MVP.Bean.UserBean;

public class UserModelImpl implements UserModel {
    @Override
    public void login(String username, String password, OnLoginListener listener) {
        if (username.equals("root") && password.equals("123")){
            UserBean userBean = new UserBean();
            userBean.setUserName(username);
            userBean.setPassword(password);
            listener.success(userBean);
        }else {
            listener.failure();
        }
    }
}
