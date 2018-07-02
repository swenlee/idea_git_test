package com.lsw.service;

import com.lsw.dao.UserDao;

/**
 * Created by Lee on 2018/6/29.
 */
public class UserService {

    public String queryName(String name){
        UserDao userDao = new UserDao();
        return userDao.selectName(name);
    }
}
