package com.demo.concurrency;

/**
 * Created on 2018/3/20.
 */
public class BasicThread {
    public static void main(String[] args){
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for liftoff.");
    }
}
