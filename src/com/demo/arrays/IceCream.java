package com.demo.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created on 2018/1/31.
 */
public class IceCream {
    private static Random random = new Random(47);
    static final String[] FLAVORS = {"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud pie"};

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("set too big");
        }
        String[] result = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            } while (picked[t]);
            result[i] = FLAVORS[t];
            picked[t] = true;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}
