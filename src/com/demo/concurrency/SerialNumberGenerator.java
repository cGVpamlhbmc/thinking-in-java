package com.demo.concurrency;

/**
 * Created on 2018/3/22.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++;// not thread-safe
    }
}
