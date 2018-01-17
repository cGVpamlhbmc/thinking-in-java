package com.demo.generics;

import com.demo.generics.watercolors.Watercolors;
import net.mindview.util.Sets;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created on 2018/1/17.
 */
public class WatercolorSet {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union: " + Sets.union(set1, set2));
        System.out.println("intersection: " + Sets.intersection(set1, set2));
        System.out.println("difference: " + Sets.difference(set1, set2));
        System.out.println("complement: " + Sets.complement(set1, set2));
    }
}
