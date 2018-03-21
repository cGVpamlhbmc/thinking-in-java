package com.demo.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2018/3/21.
 */
class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.print("DaemonSpawn " + i + " started, ");
        }
        System.out.println();
        for (int i = 0; i < t.length; i++) {
            System.out.print("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while (true) {
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}

public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("thread.isDaemon() = " + thread.isDaemon() + ", ");
        TimeUnit.SECONDS.sleep(1);
    }
}
