package com.xl.springBootDemo.service.user;

import com.xl.springBootDemo.bean.user.UserBean;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/19 0:02
 * @Modified By：
 */
public interface UserService {
    UserBean getUserById(Long id);

}
