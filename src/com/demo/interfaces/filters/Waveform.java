package com.demo.interfaces.filters;

/**
 * Created by ypj6024 on 2018/1/3.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}
