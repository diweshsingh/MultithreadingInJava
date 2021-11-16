package com.testapp.threadexample2;

public class Thread1 extends Thread{

    Thread1(String s){
        super(s);
    }

    public void run(){

        for (int i=1;i<=5;i++) {

            System.out.println(getName());

        }

    }
}
