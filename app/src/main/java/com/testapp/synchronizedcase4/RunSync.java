package com.testapp.synchronizedcase4;
/**
 * Case 4
 * This class is used for demonstration of static synchronized method in Java.
 */
public class RunSync {

    public static void main(String ...z){

        CustomThread t1 = new CustomThread("one");
        CustomThread1 t2 = new CustomThread1("two");
        CustomThread2 t3 = new CustomThread2("three");
    }
}
