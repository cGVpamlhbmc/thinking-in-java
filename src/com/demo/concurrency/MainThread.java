package com.demo.concurrency;

/**
 * Created on 2018/3/20.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
