package com.demo.generics;

/**
 * Created on 2018/1/19.
 */
class HasF {
    public void f() {
    }
}

public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T t) {
        this.obj = t;
    }

    public void manipulate() {
        obj.f();
    }
}
