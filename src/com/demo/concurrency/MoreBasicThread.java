package com.demo.concurrency;

/**
 * Created on 2018/3/20.
 */
public class MoreBasicThread {
    public static void main(String[] args){
        for (int i =0;i<5;i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for liftoff.");
    }
}
