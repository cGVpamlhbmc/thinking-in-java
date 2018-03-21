package com.demo.concurrency;

import java.io.IOException;

/**
 * Created on 2018/3/21.
 */
class UnReponsiveUI {
    private volatile double d = 1;

    public UnReponsiveUI() throws Exception {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read(); // never gets here
    }
}

public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        //! new UnRespinsiveUI(); //must kill this process
        new ResponsiveUI();
        System.in.read();
        System.out.println(d); //show progress
    }
}
