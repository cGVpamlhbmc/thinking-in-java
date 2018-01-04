package com.demo.innerclasses;

class Wrapping {
    private int i;

    public Wrapping(int i) {
        this.i = i;
    }

    public int value() {
        return i;
    }
}

public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        System.out.println(parcel8.wrapping(10).value());
    }
}
