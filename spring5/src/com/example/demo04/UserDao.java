package com.example.demo04;

/**
 * JDK 动态代理
 */
// 1.创建接口，定义方法
public interface UserDao {
    public int add(int a, int b);
    public String update(String id);
}
