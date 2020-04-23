package com.beyond.login.demo.service;

import com.beyond.login.demo.entity.*;

/**
 * @Description login servce
 *
 * @author ousa
 * @version 1.0.0
 * @date 2020-04-23
 */
public interface UserServce {
    /**
     * login
     *
     * @param loginId
     * @param loginPwd
     * @return user
     */
    public User login(String loginId, String loginPwd);
}
