package com.demo.interfaces.filters;

/**
 * Created by on 2018/1/4.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        this.lowCutoff = lowCut;
        this.highCutoff = highCut;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
