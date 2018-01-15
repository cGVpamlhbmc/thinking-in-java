package com.demo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created on 2018/1/15.
 */
public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61802"));

    public static void main(String[] args) {
        try {
            System.out.println("Whar's you name?");
            String name = input.readLine();
            System.out.println(name);
        } catch (IOException e) {
            System.err.println("I/O Exception");
        }
    }
}
