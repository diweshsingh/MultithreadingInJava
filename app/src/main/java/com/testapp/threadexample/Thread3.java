package com.testapp.threadexample;

public class Thread3 extends Thread{

    Thread3(String s){
        super(s);
    }

    public void run(){

        for (int i=1;i<=5;i++) {

            System.out.println(getName());

        }

    }
}
