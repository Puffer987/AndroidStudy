package com.study.MVP.Model;

import com.study.MVP.Bean.UserBean;

public interface OnLoginListener {
    void success(UserBean userBean);
    void failure();
}
