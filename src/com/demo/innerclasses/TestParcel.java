package com.demo.innerclasses;

import javax.swing.text.AbstractDocument;

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        public PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination = parcel4.destination("Tasmania");
//        Parcel4.PContents pContents = parcel4.new PContents();//illegal
        Parcel4.PDestination pDestination = parcel4.new PDestination("Tasmania");
        System.out.println(pDestination.readLabel());
    }
}
