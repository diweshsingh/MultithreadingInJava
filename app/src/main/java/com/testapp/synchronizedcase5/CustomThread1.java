package com.testapp.synchronizedcase5;

public class CustomThread1 extends Thread {

    Shared s;

    public CustomThread1(Shared s, String str) {
        super(str);
        this.s = s;
        start();
    }

    public void run() {
        s.show(Thread.currentThread().getName(), 20);
    }


}
