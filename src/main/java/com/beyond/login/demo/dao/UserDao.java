package com.beyond.login.demo.dao;

import com.beyond.login.demo.entity.*;

/**
 * @Description user login interface
 *
 * @author ousa
 * @version 1.0.0
 * @date 2020-04-23
 */
public interface UserDao {
    /**
     * user login
     *
     * @param loginId
     * @param loginPwd
     * @return user
     */
    public User login(String loginId, String loginPwd);
}
