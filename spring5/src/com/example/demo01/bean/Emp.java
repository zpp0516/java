package com.example.demo01.bean;

/**
 * 员工类
 *
 *      在Emp和Dept中演示 内部bean
 */
public class Emp {
    private String ename;
    private String gender;

    // 部门,使用对象形式表示
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
