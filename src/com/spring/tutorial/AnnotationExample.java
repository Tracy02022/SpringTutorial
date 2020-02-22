package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationExample {

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void playInstrument() {
        System.out.println(instrument.sound());
    }

}
