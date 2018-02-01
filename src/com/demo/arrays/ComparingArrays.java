package com.demo.arrays;

import java.util.Arrays;

/**
 * Created on 2018/2/1.
 */
public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 47);
        Arrays.fill(a2, 47);
        System.out.println(a1.equals(a2));
    }
}
