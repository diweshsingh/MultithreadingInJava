package com.testapp.threadexample;
/**
 *
 * This class is used for demonstration of how to create thread with inheritance in Java.
 */
public class RunThread {

    public static void main(String...z) {
        //Creating the thread object
        Thread thread1 = new Thread1("Thread 1");
        Thread thread2 = new Thread1("Thread 2");
        Thread thread3 = new Thread1("Thread 3");

        //Calling threads
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
