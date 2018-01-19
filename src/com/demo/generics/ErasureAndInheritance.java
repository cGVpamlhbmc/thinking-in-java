package com.demo.generics;

/**
 * Created on 2018/1/19.
 */
class GenericBase<T> {
    private T element;

    public void set(T element) {
        this.element = element;
    }

    public T get() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2 extends GenericBase {
}

public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived1<String> d1 = new Derived1<String>();
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj);
    }
}
