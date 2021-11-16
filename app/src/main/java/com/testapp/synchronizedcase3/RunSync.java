package com.testapp.synchronizedcase3;

/**
 * Case 3
 * This class is used for demonstration of synchronized and non synchronized method in Java.
 */
public class RunSync {

    public static void main(String ...z){

        Shared st = new Shared();

        CustomThread t1 = new CustomThread(st,"one");
        CustomThread1 t2 = new CustomThread1(st,"two");
    }
}
