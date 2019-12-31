package com.brilliance.ejvm.entity;

/**
 * @author hns
 * @date 2019/12/27 10:30
 * @description
 */
public class TestClass implements TestInterface {

    @Override
    public int min(int a, int b) {
        return 0;
    }

    public void setTamplateContext(){

        System.out.println("super TestClass.setTamplateContext...");

    }

}
