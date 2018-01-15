package com.demo.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/1/15.
 */
public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 1; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
