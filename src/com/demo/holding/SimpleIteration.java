package com.demo.holding;

import com.demo.typeinfo.pets.Pet;
import com.demo.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created on 2018/1/5.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + ": " + p);
        }
    }
}
