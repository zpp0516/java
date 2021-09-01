package com.example.demo01.testdemo;

import com.example.demo01.Book;
import com.example.demo01.Orders;
import com.example.demo01.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd(){
        // 1.加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext(
                "com/example/demo01/bean1.xml");
        // 2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        // 输出信息
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        // 1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo01/bean1.xml");
        // 2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo(); // 输出测试的方法
    }

    @Test
    public void testOrders(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo01/bean1.xml");
        // 2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.ordersTest();
    }
}
