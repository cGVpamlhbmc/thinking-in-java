package com.demo.interfaces.filters;

/**
 * Created by on 2018/1/3.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}
