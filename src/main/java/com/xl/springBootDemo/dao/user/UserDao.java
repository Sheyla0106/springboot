package com.xl.springBootDemo.dao.user;

import com.xl.springBootDemo.bean.user.UserBean;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/19 0:02
 * @Modified By：
 */
public interface UserDao {
    UserBean getUserById(Long id);
}
