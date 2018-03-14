package com.demo.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created on 2018/3/14.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
//        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\usr\\pj.code\\java\\thinking-in-java\\src\\com\\demo\\io\\TestEOF.java")));
        DataInputStream in = new DataInputStream(new FileInputStream("TestEOF.java"));
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}
