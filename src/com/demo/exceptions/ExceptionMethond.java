package com.demo.exceptions;

/**
 * Created on 2018/1/11.
 */
public class ExceptionMethond {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.print("printStackTrace(): ");
            e.printStackTrace(System.out);
        }
    }
}
