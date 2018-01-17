package com.demo.generics;

import com.demo.generics.coffee.Coffee;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created on 2018/1/17.
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
public static void main(String[] args){
        Collection<Coffee> coffees=fill(new ArrayList<Coffee>())
}
}
