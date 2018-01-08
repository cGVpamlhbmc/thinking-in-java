package com.demo.holding;

import com.demo.typeinfo.pets.Cat;
import com.demo.typeinfo.pets.Dog;
import com.demo.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018/1/8.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog",new Dog("Ginger"));
        System.out.println(petMap);
        System.out.println(petMap.containsKey("My Cat"));
        System.out.println(petMap.containsValue(petMap.get("My Dog")));
    }
}
