package com.demo.enumerated;

import java.util.StringTokenizer;

/**
 * Created on 2018/3/19.
 */
public enum SpaceShip {
    SCOUT, GARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip spaceShip : SpaceShip.values()) {
            System.out.println(spaceShip);
        }
    }
}
