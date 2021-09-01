package com.example.demo01.testdemo;

import com.example.demo01.bean.Emp;
import com.example.demo01.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    // 测试bean2.xml文件
    @Test
    public void testBean2(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo01/bean2.xml");
        // 2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add(); // 调用方法，输出
    }

    @Test
    public void testBean3(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo01/bean3.xml");
        // 2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add(); // 调用方法，输出
    }

    /**
     * 测试级联赋值
     */
    @Test
    public void testBean4(){
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo01/bean4.xml");
        // 2.获取配置创建的队象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }
}
