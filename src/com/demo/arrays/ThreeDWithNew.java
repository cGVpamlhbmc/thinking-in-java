package com.demo.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created on 2018/1/31.
 */
public class ThreeDWithNew {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
}
