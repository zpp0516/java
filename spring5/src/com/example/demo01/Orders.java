package com.example.demo01;

/**
 * 使用有参构造注入
 */
public class Orders {
    // 属性
    private String oname = "";
    private String address;

    // 有参构造
    public Orders(String oname, String address){
        this.oname = oname;
        this.address = address;
    }
    public void ordersTest(){
        System.out.println(oname  + "::" + address);
    }
}
