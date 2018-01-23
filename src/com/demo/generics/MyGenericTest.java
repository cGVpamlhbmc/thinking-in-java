package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/1/23.
 */

class ATestClass<T> {
    public static int i = 0;

    public ATestClass() {
        i++;
    }
}

public class MyGenericTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        List<Integer> li = new ArrayList<Integer>();
        List<Float> lf = new ArrayList<Float>();
        boolean isSame = li.getClass() == lf.getClass();
        System.out.println(li.getClass().getName());
        System.out.println(lf.getClass().getName());
        System.out.println(isSame);
        Object o = li.getClass().newInstance();
        System.out.println(o.getClass().getName());
        o = lf.getClass().newInstance();
        System.out.println(o.getClass().getName());

        ATestClass<Integer> a1 = new ATestClass<Integer>();
        ATestClass<String> a2 = new ATestClass<String>();
        System.out.println(ATestClass.i);
    }
}
