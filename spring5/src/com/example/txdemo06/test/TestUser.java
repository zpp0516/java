package com.example.txdemo06.test;

import com.example.txdemo06.config.TxConfig;
import com.example.txdemo06.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * 测试类
 */
public class TestUser {
    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/txdemo06/bean1.xml"
        );
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 事务操作（XML 声明式事务管理）
     */
    @Test
    public void testAccount1(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/txdemo06/bean2.xml"
        );
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 事务操作：完全注解开发
     */
    @Test
    public void testAccount2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(
                TxConfig.class
        );
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 函数式风格创建对象，交给spring进行管理
     */
    @Test
    public void testGenericApplicationContext(){
        // 1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();

        // 2.调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class,() -> new User());

        // 3.获取在spring注册的对象
        // 另一种方式为：使用全类名
//        User user = (User)context.getBean("com.example.txdemo06.test.User");

        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
    }
}
