package com.demo.enumerated;

import java.util.EnumMap;

/**
 * Created on 2018/3/19.
 */
interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });

        try {
            em.get(AlarmPoints.KITCHEN).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
