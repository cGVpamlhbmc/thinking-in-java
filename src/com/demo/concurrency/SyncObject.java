package com.demo.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2018/3/22.
 */
class DualSynch {
    private Object synchObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() throws InterruptedException {
        synchronized (synchObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                TimeUnit.MILLISECONDS.sleep(100);
                Thread.yield();
            }
        }
    }
}

public class SyncObject {
    public static void main(String[] args) throws InterruptedException {
        final DualSynch ds = new DualSynch();
        new Thread() {
            public void run() {
                ds.f();
            }
        }.start();
        ds.g();
    }
}
