package com.example.demo04.test;

import com.example.demo04.aopanno.User;
import com.example.demo04.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class AopTest {
    @Test
    public void testAopAnno(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo04/bean1.xml");
        // 2.获取配置信息
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo04/bean2.xml"
        );
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
