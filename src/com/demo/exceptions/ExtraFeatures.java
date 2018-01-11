package com.demo.exceptions;

/**
 * Created on 2018/1/11.
 */
class MyException2 extends Exception {
    private int x;

    public MyException2() {
    }

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public void f() throws MyException2 {
        System.out.println("Throw MyException2 from f()");
        throw new MyException2();
    }

    public void g() throws MyException2 {
        System.out.println("Throw MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public void h() throws MyException2 {
        System.out.println("Throw MyException2 from h()");
        throw new MyException2("Originated in h()", 47);
    }

    public static void main(String[] args) {
        ExtraFeatures extraFeatures = new ExtraFeatures();
        try {
            extraFeatures.f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            extraFeatures.g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
        try {
            extraFeatures.h();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
