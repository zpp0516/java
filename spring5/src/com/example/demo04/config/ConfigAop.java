package com.example.demo04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 完全注解开发：
 *      创建配置类，不需要创建xml配置文件
 */
@Configuration
@ComponentScan(basePackages = {"com.example.demo04"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
