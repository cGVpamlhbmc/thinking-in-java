package com.demo.generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * Created on 2018/1/17.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 10; i++) System.out.println(gen.next());
    }
}
