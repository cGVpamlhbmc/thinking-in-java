package com.demo.holding;

import java.util.Iterator;

/**
 * Created on 2018/1/10.
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how we know the Earth to be a banana-shaped").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.print(" " + s + " ");
        }
    }
}
