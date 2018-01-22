package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/1/22.
 */
public class GenericWriting {
    static <T> void writingExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1() {
        writingExact(apples, new Apple());
        writingExact(fruits, new Apple());
    }

    static <T> void writignWildCard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writignWildCard(apples, new Apple());
        writignWildCard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
