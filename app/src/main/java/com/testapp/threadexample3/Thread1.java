package com.testapp.threadexample3;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }

}
