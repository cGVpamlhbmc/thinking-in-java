package com.demo.io;

import java.io.PrintWriter;

/**
 * Created on 2018/3/15.
 */
public class ChangeSystemOut {
    public static void main(String[] args){
        PrintWriter out=new PrintWriter(System.out,true);
        out.println("Hello world.");
    }
}
