package com.demo.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created on 2018/1/31.
 */
public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
                {new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()}
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
