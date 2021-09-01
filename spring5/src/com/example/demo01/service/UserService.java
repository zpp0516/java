package com.example.demo01.service;

import com.example.demo01.dao.UserDao;

/**
 * 注入属性：外部bean
 *  在service里调用dao里面的方法
 */
public class UserService {
    // 创建UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add..............");
        userDao.update();
    }
}
