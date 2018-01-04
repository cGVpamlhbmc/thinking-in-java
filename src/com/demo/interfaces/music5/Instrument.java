package com.demo.interfaces.music5;

import com.demo.polymorphism.music.Note;

interface Instrument{
    int VALUE = 5; //static & final
    void play(Note n);
    void adjust();
}
