package com.beyond.login.demo.dao;

import com.beyond.login.demo.entity.*;

/**
 * @Description user login impl
 *
 * @author ousa
 * @version 1.0.0
 * @date 2020-04-23
 */
public class UserDaoImpl implements UserDao {
    /**
     * user login
     *
     * @param loginId
     * @param loginPwd
     * @return user
     */
    public User login(String loginId, String loginPwd) {
        User user = null;
        if("admin".equals(loginId)){
            if ("admin".equals(loginPwd)) {
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
            }
        }
        return user;
    }
}
