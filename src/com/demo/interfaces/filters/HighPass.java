package com.demo.interfaces.filters;

/**
 * Created by ypj6024 on 2018/1/4.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
