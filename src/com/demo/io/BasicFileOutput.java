package com.demo.io;

import java.io.*;

/**
 * Created on 2018/3/14.
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput1.java";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
