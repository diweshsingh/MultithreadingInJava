package com.testapp.synchronizedcase5;

public class Shared {

    static int x;

    synchronized static void show(String s,int a){
        x=a;
        System.out.println("Starting in method "+ s+ " "+x);
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println("Ending from method "+ s+ " "+x);

    }
}
