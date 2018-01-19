package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/1/19.
 */
public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> listMaker = new ListMaker<String>();
        List<String> stringList = listMaker.create();
    }
}
