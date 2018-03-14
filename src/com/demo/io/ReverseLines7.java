package com.demo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2018/3/14.
 */
public class ReverseLines7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("BufferedInputFile.java"));
        String s;
        LinkedList<String> list = new LinkedList<>();
        while ((s = in.readLine()) != null) {
            list.add(s);
        }
        in.close();
        StringBuilder sb = new StringBuilder(); // For output String
        while (list.peekLast() != null) // While there is a lase line
            sb.append(list.pollLast() + "\n"); // Removes line
        System.out.println(sb);
    }
}
