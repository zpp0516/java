package com.example.txdemo06.test;

import com.example.txdemo06.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring5整合Junit4
 */
@RunWith(SpringJUnit4ClassRunner.class)  // 单元测试框架
// 加载配置文件
@ContextConfiguration("classpath:com/example/txdemo06/bean1.xml")
public class Junit4Test {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
