package com.beyond.login.demo.entity;

import java.io.Serializable;

/**
 * @Description user entity
 *
 * @author ousa
 * @version 1.0.0
 * @date 2020-04-23
 */
public class User implements Serializable {
    private String loginId;
    private String loginPwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}
