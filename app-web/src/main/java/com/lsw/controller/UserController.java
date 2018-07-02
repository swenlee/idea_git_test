package com.lsw.controller;

import com.lsw.service.UserService;

/**
 * Created by Lee on 2018/6/29.
 */
public class UserController {
    public static void main(String[] args) {
        UserService userService = new UserService();

        String lsw = userService.queryName("lsw");

        System.out.println(lsw);
    }
}
