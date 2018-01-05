package com.demo.holding;

import com.demo.typeinfo.pets.*;

import java.util.List;
import java.util.Random;

/**
 * Created on 2018/1/5.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster hamster = new Hamster();
        pets.add(hamster);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(hamster));
        pets.remove(hamster);
        Pet pet = pets.get(2);
        System.out.println("4: " + pet + " " + pets.indexOf(pet));

    }
}
