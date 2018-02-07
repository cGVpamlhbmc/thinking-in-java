package com.demo.contrainers;

import java.util.PriorityQueue;

/**
 * Created on 2018/2/7.
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String td, char pri, int sec) {
            primary = pri;
            secondary = sec;
            item = td;
        }

        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary) return 1;
            if (primary == arg.primary) {
                if (secondary > arg.secondary) return 1;
                else if (secondary == arg.secondary) return 0;
            }
            return -1;
        }

        public String toString() {
            return Character.toString(primary) + secondary + ": " + item;
        }
    }

    public void add(String td, char pri, int sec) {
        super.add(new ToDoItem(td, pri, sec));
    }

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.add("Empty trash", 'C', 4);
        list.add("Feed dog", 'A', 2);
        list.add("Feed bird", 'B', 7);
        list.add("Mow lawn", 'C', 3);
        list.add("Water lawn", 'A', 1);
        list.add("Feed cat", 'B', 1);
        while (!list.isEmpty()) {
            System.out.println(list.remove());
        }
    }
}
