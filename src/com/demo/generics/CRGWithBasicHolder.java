package com.demo.generics;

/**
 * Created on 2018/1/22.
 */
class SubType extends BasicHolder<SubType> {
}

class Other{}
class BasicOther extends BasicHolder<Other>{}

public class CRGWithBasicHolder {
    public static void main(String[] args) {
//        SubType t1 = new SubType();
//        SubType t2 = new SubType();
//        t1.set(t2);
//        SubType t3 = t1.get();
//        t1.f();

        BasicOther bo1=new BasicOther(),bo2=new BasicOther();
        bo1.set(new Other());
        Other o=bo1.get();
        bo1.f();
    }
}
