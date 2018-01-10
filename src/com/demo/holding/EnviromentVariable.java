package com.demo.holding;

import java.util.Map;

/**
 * Created on 2018/1/10.
 */
public class EnviromentVariable {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
