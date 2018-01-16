package com.demo.generics.coffee;

/**
 * Created on 2018/1/17.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
