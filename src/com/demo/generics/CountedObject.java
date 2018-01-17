package com.demo.generics;

/**
 * Created on 2018/1/17.
 */
public class CountedObject {
    public static long counter = 0;
    public final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject: " + id;
    }
}
