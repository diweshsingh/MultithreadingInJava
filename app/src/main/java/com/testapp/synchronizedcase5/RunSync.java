package com.testapp.synchronizedcase5;
/**
 * Case 5
 * This class is used for demonstration of calling the static and non static way in Java.
 */
public class RunSync {

    public static void main(String ...z){

        Shared st = new Shared();

        CustomThread t1 = new CustomThread("one");
        CustomThread1 t2 = new CustomThread1(st,"two");
    }
}
