package com.example.demo02.testdemo;

import com.example.demo02.autowire.Emp;
import com.example.demo02.bean.Orders;
import com.example.demo02.collectiontype.Book;
import com.example.demo02.collectiontype.Course;
import com.example.demo02.collectiontype.Stu;
import com.example.demo02.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class TestSpring5Demo {
    @Test
    public void testCollection1(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo02/bean1.xml");
        // 2.获取配置信息
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo02/bean2.xml");
        // 2.获取配置信息
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

//        book1.test();  // 调用输出信息
        // 在spring里面，默认情况下，bean是单实例对象
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testMyBean(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo02/bean3.xml");
        // 2.获取配置信息
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testBean4(){
        // 1.加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo02/bean4.xml");
        // 2.获取配至信息
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        // 销毁实例
        context.close();
    }

    @Test
    public void testBean5(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/demo02/bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
