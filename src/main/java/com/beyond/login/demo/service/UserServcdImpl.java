package com.beyond.login.demo.service;

import com.beyond.login.demo.dao.*;
import com.beyond.login.demo.entity.*;

/**
 * @Description login servce impl
 *
 * @author ousa
 * @version 1.0.0
 * @date 2020-04-23
 */
public class UserServcdImpl implements UserServce {

    UserDao userDao = new UserDaoImpl();

    /**
     * login
     *
     * @param loginId
     * @param loginPwd
     * @return user
     */
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId, loginPwd);
    }
}
