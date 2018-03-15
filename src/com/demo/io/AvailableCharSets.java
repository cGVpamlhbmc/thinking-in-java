package com.demo.io;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * Created on 2018/3/15.
 */
public class AvailableCharSets {
    public static void main(String[] args) {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String cName = it.next();
            System.out.print(cName);
            Iterator aliases = map.get(cName).aliases().iterator();
            if (aliases.hasNext()) {
                System.out.print(": ");
            }
            while (aliases.hasNext()) {
                System.out.print(aliases.next());
                if (aliases.hasNext()) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
