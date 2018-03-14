package com.demo.io;

import com.demo.generics.Fill;
import net.mindview.util.Directory;
import net.mindview.util.PPrint;

import java.io.File;

/**
 * Created on 2018/3/14.
 */
public class DirectoryDemo {
    public static void main(String[] args) {
//        PPrint.pprint(Directory.walk(".").dirs);

        for (File file : Directory.local(".", "\\.git")) {
            System.out.println(file);
        }
        System.out.println("----------");
        for (File file : Directory.walk(".", "T.*\\.java")) {
            System.out.println(file);
        }
        System.out.println("==========");
        for (File file : Directory.walk(".", ".*[Zz].*\\.class")) {
            System.out.println(file);
        }
    }
}
