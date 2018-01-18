package com.demo.generics;

import net.mindview.util.ThreeTuple;
import net.mindview.util.Tuple;

import java.util.ArrayList;

/**
 * Created on 2018/1/18.
 */
public class TupleList<A, B, C> extends ArrayList<ThreeTuple<A, B, C>> {
    public static void main(String[] args) {
        TupleList<Amphibian, String, Integer> t1 = new TupleList<>();
        t1.add(TupleTest.g());
        t1.add(TupleTest.g());
        t1.add(TupleTest.g());
        for (ThreeTuple<Amphibian, String, Integer> item : t1) System.out.println(item);
    }
}
