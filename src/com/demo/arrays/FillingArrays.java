package com.demo.arrays;

import java.util.Arrays;

/**
 * Created on 2018/2/1.
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        String[] a9 = new String[size];
        Arrays.fill(a1, true);
        System.out.println("a1 = " + Arrays.toString(a1));
        Arrays.fill(a9, "hello");
        System.out.println("a9 = " + Arrays.toString(a9));
        Arrays.fill(a9, 3, 5, "world");
        System.out.println("a9 = " + Arrays.toString(a9));
    }
}
