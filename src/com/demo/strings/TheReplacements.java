package com.demo.strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters. then process the
    extracted block. !*/

/**
 * Created on 2018/1/15.
 */
public class TheReplacements {
    public static void main(String[] args) {
        String s = TextFile.read("src/com/demo/strings/TheReplacements.java");
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find()) {
            s = mInput.group(1);
        }
        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^+", "");
        System.out.println(s);
    }
}
