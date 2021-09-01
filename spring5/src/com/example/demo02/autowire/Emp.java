package com.example.demo02.autowire;

/**
 * IOC 操作Bean管理：xml自动装配 演示
 */
public class Emp {
    private Dept dept;  // 使用Dept对象

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
