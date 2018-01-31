package com.demo.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/1/31.
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<String>();
//        ls[1] = new ArrayList<Integer>();

        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
        for (int i = 0; i < 10; i++) {
            spheres[i] = new ArrayList<BerylliumSphere>();
        }
    }
}
