package com.demo.generics;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created on 2018/1/22.
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return this.value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple apple = appleHolder.get();
        appleHolder.set(apple);
        Holder<? extends Fruit> fruitHolder = appleHolder;
        Fruit fruit = fruitHolder.get();
        apple = (Apple) fruitHolder.get();
        try {
            Orange orange = (Orange) fruitHolder.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(fruitHolder.equals(apple));
    }
}
