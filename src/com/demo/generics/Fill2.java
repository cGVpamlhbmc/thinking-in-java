package com.demo.generics;

import com.demo.generics.coffee.Coffee;
import com.demo.generics.coffee.Latte;
import com.demo.generics.coffee.Mocha;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created on 2018/1/30.
 */

interface Addable<T> {
    void add(T t);
}

public class Fill2 {
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
            try {
                addable.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++) {
            addable.add(generator.next());
        }
    }
}

class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }

    public void add(T item) {
        c.add(item);
    }
}

class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<T>(c);
    }
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
    public void add(T item) {
        super.add(item);
    }
}

class Fill2Test {
    public static void main(String[] args) {
        List<Coffee> carrier = new ArrayList<>();
        Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Latte.class, 2);
        Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 3);
        for (Coffee c : carrier) {
            System.out.println(c);
        }
        System.out.println("----------");
        AddableSimpleQueue<Coffee> coffees = new AddableSimpleQueue<>();
        Fill2.fill(coffees, Mocha.class, 4);
        Fill2.fill(coffees, Latte.class, 1);
        for (Coffee c : coffees) {
            System.out.println(c);
        }
    }
}
