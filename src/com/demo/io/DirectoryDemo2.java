package com.demo.io;

import net.mindview.util.Directory;

import java.io.File;

/**
 * Created on 2018/3/14.
 */
public class DirectoryDemo2 {
    public static void main(String[] args){
        long sum = 0;
        for (File file : Directory.walk(".", ".*")) {
            System.out.print(file + ": ");
            System.out.println(file.length());
            sum += file.length();
        }
        System.out.println("Total size: " + sum);
    }
}
