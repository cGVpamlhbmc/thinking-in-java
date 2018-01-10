package com.demo.holding;

import com.demo.typeinfo.pets.Pet;
import com.demo.typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created on 2018/1/10.
 */
public class CollectionSqeuence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    @Override
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

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSqeuence c = new CollectionSqeuence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
