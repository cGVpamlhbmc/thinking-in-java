package com.demo.contrainers;

import net.mindview.util.CollectionData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created on 2018/2/1.
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("ten");
        c.add("eleven");
        System.out.println(c);

        Object[] o = c.toArray();
        String[] s = c.toArray(new String[0]);
        System.out.println("Collections.max(c) = " + Collections.max(c));
        //...
    }
}
