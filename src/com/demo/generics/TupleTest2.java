package com.demo.generics;

import com.demo.interfaces.interfaceprocessor.StringProcessor;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;
import static net.mindview.util.Tuple.*;

/**
 * Created on 2018/1/16.
 */
public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
        System.out.println(g());
    }
}
