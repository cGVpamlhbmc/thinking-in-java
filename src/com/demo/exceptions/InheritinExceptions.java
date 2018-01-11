package com.demo.exceptions;

/**
 * Created on 2018/1/11.
 */

class SimpleException extends Exception {
}

public class InheritinExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritinExceptions inheritinExceptions = new InheritinExceptions();
        try {
            inheritinExceptions.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
