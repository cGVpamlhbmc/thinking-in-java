package com.demo.exceptions;

/**
 * Created on 2018/1/11.
 */
class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}

public class FullConstructors {
    public void f() throws MyException {
        System.out.println("Throw MyException from f()");
        throw new MyException();
    }

    public void g() throws MyException {
        System.out.println("Throw MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        FullConstructors fullConstructors = new FullConstructors();
        try {
            fullConstructors.f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            fullConstructors.g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
