package com.demo.generics;

import com.demo.typeinfo.pets.Cat;
import com.demo.typeinfo.pets.Pet;

/**
 * Created on 2018/1/16.
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.get();
        Holder3<Pet> petHolder = new Holder3<>(new Cat());
    }
}
