package com.demo.holding;

import com.demo.typeinfo.pets.*;

import java.util.Iterator;

/**
 * Created on 2018/1/10.
 */
class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NoCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NoCollectionSequence c = new NoCollectionSequence();
        InterfaceVsIterator.display(c.iterator());
    }
}
