package com.example.demo03.service;

import com.example.demo03.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 创建类，在其上面添加创建对象注解
 */
//@Component(value = "userService")  // 等价于：<bean id="userService" class=".."/>
@Service
public class UserService {

    @Value(value = "abc")  // 对name属性进行传值
    private String name;

    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
//    @Autowired // 根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")  // 根据名称进行注入
//    private UserDao userDao;

//    @Resource // 根据类型进行注入
    @Resource(name = "userDaoImpl1") // 根据名称进行注入
    private UserDao userDao;

    public void add(){
        System.out.println("Service add..........." + name);
        userDao.add();
    }
}
