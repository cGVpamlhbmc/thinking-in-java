package com.demo.concurrency;

/**
 * Created on 2018/3/22.
 */
public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
