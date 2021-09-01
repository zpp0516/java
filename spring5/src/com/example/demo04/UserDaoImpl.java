package com.example.demo04;

/**
 * 2.创建接口实现类，实现UserDao类中的方法
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
