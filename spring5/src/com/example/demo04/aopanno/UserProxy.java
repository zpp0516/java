package com.example.demo04.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 创建增强类（编写增强逻辑）
 */
// 2.在增强类里面，创建方法，让不同方法代表不同通知类型
@Component // 增强的类
@Aspect  // 生成代理对象
@Order(3)
public class UserProxy {
    // 相同切入点抽取
    @Pointcut(value = "execution(* com.example.demo04.aopanno.User.add())")
    public void pointdemo(){

    }

    // 前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before...........");
    }

    // 后置通知(返回通知)
    @AfterReturning(value = "execution(* com.example.demo04.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning..........");
    }

    // 最终通知
    @After(value = "execution(* com.example.demo04.aopanno.User.add(..))")
    public void after(){
        System.out.println("after...........");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.example.demo04.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing..........");
    }

    // 环绕通知\
    @Around(value = "execution(* com.example.demo04.aopanno.User.add(..))" )
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前..............");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后..............");
    }

}
