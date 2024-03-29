package com.demo.interfaces.interfaceprocessor;

import com.demo.interfaces.filters.*;

class FilterAdaper implements Processor {
    Filter filter;

    public FilterAdaper(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdaper(new LowPass(1.0)), waveform);
        Apply.process(new FilterAdaper(new HighPass(2.0)), waveform);
        Apply.process(new FilterAdaper(new BandPass(3.0, 4.0)), waveform);
    }
}
