package com.demo.generics;

import com.demo.interfaces.interfaceprocessor.StringProcessor;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

/**
 * Created on 2018/1/16.
 */
class Amphibian {
}

class Vehicle {
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
    }
}
