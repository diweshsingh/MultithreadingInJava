package com.testapp.synchronizedcase2;

public class Shared {

    int x;

    synchronized void show(String s,int a){
        x=a;
        System.out.println("Starting in show method "+ s+ " "+x);
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println("Ending from show method "+ s+ " "+x);

    }

    synchronized void display(String s,int a){
        x=a;
        System.out.println("Starting in display method "+ s+ " "+x);
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println("Ending from display method "+ s+ " "+x);

    }
}
