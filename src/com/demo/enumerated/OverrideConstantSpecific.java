package com.demo.enumerated;

/**
 * Created on 2018/3/19.
 */
public enum OverrideConstantSpecific {
    NUT, BOLT, WASHER {
        void f() {
            System.out.println("Overridden method");
        }
    };

    void f() {
        System.out.println("default method");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            ocs.f();
        }
    }
}
