package com.demo.io;

import net.mindview.util.ProcessFiles;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 2018/3/14.
 */
public class ModifiedAfter6 {
    public static void main(final String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                Date modDate = new Date(file.lastModified());
                try {
                    if (modDate.after(sdf.parse("2018-03-01")))
                        System.out.println(file);
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }, "java").start(args);
    }
}
