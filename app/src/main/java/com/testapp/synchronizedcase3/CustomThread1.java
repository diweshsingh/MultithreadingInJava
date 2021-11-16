package com.testapp.synchronizedcase3;

public class CustomThread1 extends Thread {
    Shared s;

    public CustomThread1(Shared s, String str) {
        super(str);
        this.s = s;
        start();
    }

    public void run() {
        s.display(Thread.currentThread().getName(), 20);
    }


}
