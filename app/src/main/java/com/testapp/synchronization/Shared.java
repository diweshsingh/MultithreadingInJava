package com.testapp.synchronization;

public class Shared {

    int x;

    synchronized void show(String s,int a){
        x=a;
        System.out.println("Starting in method "+ s+ " "+x);
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println("Ending from method "+ s+ " "+x);

    }

}
