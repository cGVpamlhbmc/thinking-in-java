package com.demo.contrainers;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created on 2018/3/9.
 */

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (Month m : Month.values()) {
            stack.push(m.toString());
        }
        System.out.println("stack = " + stack);
        stack.addElement("The last line");
        System.out.println("element 5 = " + stack.elementAt(5));
        System.out.println("popping elements: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        LinkedList<String> lstack = new LinkedList<>();
        for (Month m : Month.values()) {
            lstack.addFirst(m.toString());
        }
        System.out.println("lstack = " + lstack);
        while (!lstack.isEmpty()) {
            System.out.print(lstack.removeFirst() + " ");
        }

    }
}
