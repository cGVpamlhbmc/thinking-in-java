package com.demo.generics.coffee;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created on 2018/1/17.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cuppuccino.class, Americano.class, Breve.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int sz) {
        this.size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator cg = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.print(cg.next() + " ");
        }
        System.out.println();
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.print(c + " ");
        }
    }
}
