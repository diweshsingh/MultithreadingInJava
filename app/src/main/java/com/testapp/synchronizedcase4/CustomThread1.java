package com.testapp.synchronizedcase4;

public class CustomThread1 extends Thread {


    public CustomThread1(String str) {
        super(str);

        start();
    }

    public void run() {
        Shared.show(Thread.currentThread().getName(), 20);
    }


}
