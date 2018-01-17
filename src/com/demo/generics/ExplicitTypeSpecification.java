package com.demo.generics;

import com.demo.typeinfo.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created on 2018/1/17.
 */
public class ExplicitTypeSpecification {
    static void f(Map<String, List<Pet>> map) {
    }

    public static void main(String[] args) {
        f(New.map());
        f(New.<String, List<Pet>>map());
    }
}
