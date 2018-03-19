package com.demo.enumerated;

import net.mindview.util.Enums;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created on 2018/3/19.
 */

enum Activity {
    SITTING, LYING, STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Activity.class) + " ");
        }
    }
}
