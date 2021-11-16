package com.testapp.startandsleep;

public class Thread1 extends Thread{

    Thread1(String s){
        super(s);
    }

    public void run(){

        for (int i=1;i<=5;i++) {

            System.out.println(getName());

            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }

        }
        System.out.println(getName() +" Dead");

    }
}
