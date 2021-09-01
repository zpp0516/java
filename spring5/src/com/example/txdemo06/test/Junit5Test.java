package com.example.txdemo06.test;

import com.example.txdemo06.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring5整合Junit5
 */
//@ExtendWith(SpringExtension.class)
// 加载配置文件
//@ContextConfiguration("classpath:com/example/txdemo06/bean1.xml")

// 复合注解
@SpringJUnitConfig(locations = "classpath:com/example/txdemo06/bean1.xml")
public class Junit5Test {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
