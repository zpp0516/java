package com.example.demo03.testdemo;

import com.example.demo03.config.SpringConfig;
import com.example.demo03.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo {
    @Test
    public void testBean(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo03/bean1.xml"
        );
        // 2.获取配置信息
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    // 基于注解方式
    @Test
    public void testService(){
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }
}
