package com.study.MVP.Model;

public interface UserModel {
    void login(String username,String password, OnLoginListener listener);
}
