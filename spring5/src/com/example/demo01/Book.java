package com.example.demo01;

/**
 * 演示set方法进行注入属性
 */
public class Book {
    private String bname;  // 名称
    private String bauthor; //  姓名
    private String address; // 住址

    // 创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // 定义一个方法
    public void testDemo(){
        System.out.println(bname+"::"+bauthor+"::"+address);
    }
}
