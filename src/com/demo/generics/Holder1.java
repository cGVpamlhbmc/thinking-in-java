package com.demo.generics;

/**
 * Created on 2018/1/15.
 */

class Automobile {
}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}
