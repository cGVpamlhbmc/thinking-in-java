package com.demo.generics;

/**
 * Created on 2018/1/19.
 */
class ClassFactory<T> {
    T t;

    public ClassFactory(Class<T> type) {
        try {
            t = type.newInstance();
            System.out.println(type.getSimpleName()+" create succeeded");
        } catch (Exception e) {
            System.out.println(type.getSimpleName()+" create failed");
            throw new RuntimeException(e);
        }
    }
}

class Employee{}

public class InstantiateGenericType {
    public static void main(String[] args){
        ClassFactory<Employee> c1=new ClassFactory<Employee>(Employee.class);
        ClassFactory<Integer> c2=new ClassFactory<Integer>(Integer.class);
    }
}
