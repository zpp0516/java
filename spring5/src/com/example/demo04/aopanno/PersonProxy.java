package com.example.demo04.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
// 有多个增强类对同一个方法进行增强时，设置增强优先级
@Order(1)   // 数字类型值越小，优先级越高
public class PersonProxy {
    // 后置通知（返回通知）
    @Before(value = "execution(* com.example.demo04.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("Person before............");
    }
}
