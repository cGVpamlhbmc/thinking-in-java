package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/1/19.
 */
public class FillListMaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) result.add(t);
        return result;
    }

    public static void main(String[] args) {
        FillListMaker<String> maker = new FillListMaker<String>();
        List<String> list = maker.create("hello", 5);
        System.out.println(list);
    }
}
