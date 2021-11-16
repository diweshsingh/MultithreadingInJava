package com.testapp.synchronizedcase4;

public class CustomThread2 extends Thread {


    public CustomThread2( String str) {
        super(str);
        start();
    }

    public void run() {
        Shared.show(Thread.currentThread().getName(), 30);
    }


}
