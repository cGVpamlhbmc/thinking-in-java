package com.demo.contrainers;

import java.util.Random;

/**
 * Created on 2018/2/23.
 */
public class Prediction {
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble() > 0.5;

    public String toString() {
        if (shadow) return "Six more weeks of Winter!";
        else return "Early Spring!";
    }
}
