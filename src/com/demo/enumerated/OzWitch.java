package com.demo.enumerated;

/**
 * Created on 2018/3/16.
 */
public enum OzWitch {
    WEST("Miss Gulch, aka the wicked witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked witch of the East, wearer of Ruby Slippers, crushed by Dorothy's house"),
    SOUTH("Good by interface, but missing");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch + ": " + ozWitch.getDescription());
        }
    }
}
