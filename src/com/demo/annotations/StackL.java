package com.demo.annotations;

import java.util.LinkedList;

/**
 * Created on 2018/3/20.
 */
public class StackL<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    public void push(T t) {
        linkedList.add(t);
    }

    public T top() {
        return linkedList.getFirst();
    }

    public T pop() {
        return linkedList.removeFirst();
    }
}
