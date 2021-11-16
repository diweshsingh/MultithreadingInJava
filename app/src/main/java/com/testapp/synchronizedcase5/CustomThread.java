package com.testapp.synchronizedcase5;

public class CustomThread extends Thread {

    public CustomThread(String str) {
        super(str);
        start();
    }

    public void run() {
        Shared.show(Thread.currentThread().getName(), 10);
    }


}
