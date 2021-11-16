package com.testapp.threadexample;

public class Thread2 extends Thread{

    Thread2(String s){
        super(s);
    }

    public void run(){

        for (int i=1;i<=5;i++) {

            System.out.println(getName());

        }

    }
}
