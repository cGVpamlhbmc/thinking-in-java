package com.demo.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created on 2018/1/10.
 */

class ReversaibleArrayList<T> extends ArrayList<T> {
    public ReversaibleArrayList(Collection<T> collection) {
        super(collection);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator(){
                return new Iterator<T>() {
                    private int current = size() - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public T next() {
                        return get(current--);
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversaibleArrayList<String> ral = new ReversaibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
    }
}
