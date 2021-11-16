package com.testapp.synchronizedcase6;

public class RunSync {

    public static void main(String ...z){

        Shared st = new Shared();

        CustomThread t1 = new CustomThread("one");
        CustomThread1 t2 = new CustomThread1(st,"two");
    }
}
