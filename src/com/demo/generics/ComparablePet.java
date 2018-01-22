package com.demo.generics;

/**
 * Created on 2018/1/22.
 */
public class ComparablePet implements Comparable<ComparablePet> {
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

//class Cat extends ComparablePet implements Comparable<Cat>{
//
//}
