package com.demo.exceptions;

/**
 * Created on 2018/1/11.
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("from f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
