package com.example.demo03.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 完全注解开发
 */
@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.example.demo03"}) // 替代xml文件
public class SpringConfig {
}
