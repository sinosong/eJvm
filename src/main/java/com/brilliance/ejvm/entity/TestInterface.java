package com.brilliance.ejvm.entity;

/**
 * @author hns
 * @date 2019/12/26 21:20
 * @description
 */
public interface TestInterface
{
//    String print();

    int min(int a,int b);

    static void TestInterfaceStatic(){
        System.out.println("TestInterfaceStatic...");
    }

    default void objMethod(){
        System.out.println("objMethod...");
    }

}
