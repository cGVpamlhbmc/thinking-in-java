package com.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created on 2018/3/14.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
}
