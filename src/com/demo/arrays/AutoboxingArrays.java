package com.demo.arrays;

import java.util.Arrays;

/**
 * Created on 2018/1/31.
 */
public class AutoboxingArrays {
    public static void main(String[] args) {
        Integer[][] a = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60}
        };
        System.out.println(Arrays.deepToString(a));
    }
}
