package com.kuang.service;

import com.kuang.dao.UserDao;

/**
 * @author liuhuan
 * @create 2020-02-27 18:50
 */
public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
