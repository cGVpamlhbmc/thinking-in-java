package com.demo.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created on 2018/1/5.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(30));
        }
        System.out.println(set);
    }
}
