package com.testapp.threadexample3;
/**
 *
 * This class is used for demonstration of how to create thread with Association in Java.
 */
public class RunThread {

    public static void main(String...z) {
        //Creating the thread object
        Thread1 thread1 = new Thread1();
        Thread thread11 = new Thread(thread1,"Thread1");

        Thread1 thread2 = new Thread1();
        Thread thread22 = new Thread(thread2,"Thread2");


        //Calling threads
        thread11.start();
        thread22.start();




    }
}
