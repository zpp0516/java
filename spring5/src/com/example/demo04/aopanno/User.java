package com.example.demo04.aopanno;

import org.springframework.stereotype.Component;

/**
 * AOP 操作：Aspectj注解
 */
// 1.创建类，在类里面定义方法
// 被增强的类
@Component
public class User {
    public void add(){
//        int i = 10/0;

        System.out.println("add.........");
    }
}
