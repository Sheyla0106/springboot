package com.xl.springBootDemo.controller.user;

import com.xl.springBootDemo.bean.user.UserBean;
import com.xl.springBootDemo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sheyla
 * @Description:
 * @Date:Create：in 2019/6/19 0:17
 * @Modified By：
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserBean gerUserById(@PathVariable Long id) {
        UserBean userBean = new UserBean();

        userBean = userService.getUserById(id);
        return userBean;
    }
}
