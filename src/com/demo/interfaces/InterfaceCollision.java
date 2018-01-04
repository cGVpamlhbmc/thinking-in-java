package com.demo.interfaces;

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    @Override
    public void f() {
    }

    @Override
    public int f(int i) {
        return 1;
    }
}

class C3 extends C implements I2 {

    @Override
    public int f(int i) {
        return 1;
    }
}

class C4 extends C implements I3 {
//    public int f() {
//        return 2;
//    }
}

//class C5 extends C implements I1{}//error
//interface I4 extends I1,I3{}//error

public class InterfaceCollision {
    public static void main(String[] args) {
        I3 i3 = new C4();
        System.out.println(i3.f());
    }
}
