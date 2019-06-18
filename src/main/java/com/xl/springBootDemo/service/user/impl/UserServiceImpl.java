package com.xl.springBootDemo.service.user.impl;

import com.xl.springBootDemo.bean.user.UserBean;
import com.xl.springBootDemo.dao.user.UserDao;
import com.xl.springBootDemo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/19 0:04
 * @Modified By：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserBean getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
