package com.beyond.login.demo.web.controller;

import com.beyond.login.demo.entity.*;
import com.beyond.login.demo.service.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description login controller
 *
 * @author ousa
 * @version 1.0.0
 * @date 2020-04-23
 */
public class LoginController extends HttpServlet {

    private UserServce userServcd = new UserServcdImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");

        User user = userServcd.login(loginId, loginPwd);

        // login fail
        if(user == null) {
            req.getRequestDispatcher("/fail.jsp").forward(req, resp);
        }

        // login success
        else {
            req.getRequestDispatcher("/success.jsp").forward(req, resp);
        }

    }
}
