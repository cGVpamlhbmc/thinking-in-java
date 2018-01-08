package com.demo.holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created on 2018/1/8.
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> intSet = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            intSet.add(random.nextInt(30));
        }
        System.out.println(intSet);
    }
}
