package com.demo.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2018/3/21.
 */
class ADadmon implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            System.out.println("Exiting via InterruptedException");
        }finally {
            System.out.println("This should always run?");
        }
    }
}
public class DaemonDontRunFinally {
    public static void main(String[] args){
        Thread t =new Thread(new ADadmon());
        //t.setDaemon(true);
        t.start();
    }
}
