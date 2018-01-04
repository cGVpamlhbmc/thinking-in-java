package com.demo.interfaces.interfaceprocessor;

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor: " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "If she weighs the same as a duck, she's made of wood";

    public static void main(String[] args) {

        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}