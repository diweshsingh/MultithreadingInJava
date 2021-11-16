package com.testapp.synchronizedcase2;

/**
 * Case 2
 * This class is used for demonstration of 2 synchronized method calling from different thread in Java.
 */
public class RunSync {

    public static void main(String ...z){

        Shared st = new Shared();

        CustomThread t1 = new CustomThread(st,"one");
        CustomThread1 t2 = new CustomThread1(st,"two");
    }
}
