package com.testapp.synchronization;

public class RunSync {

    public static void main(String ...z){

        Shared st = new Shared();

        CustomThread t1 = new CustomThread(st,"one");
        CustomThread1 t2 = new CustomThread1(st,"two");
        CustomThread2 t3 = new CustomThread2(st,"three");
    }
}
