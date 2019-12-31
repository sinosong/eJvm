package com.brilliance.ejvm.entity;

/**
 * @author hns
 * @date 2019/12/27 19:28
 * @description
 */
public class Son extends TestClass {


    @Override
    public void setTamplateContext(){
        System.out.println("son method...");
//        super.setTamplateContext();
        System.out.println("-------------------");
//        this.setTamplateContext();
        System.out.println("-------------------");
        setTamplateContext();
    }


}
