package com.spring.tutorial;

public class PlayInstrument {
    Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }




    public void playedInstrument() {
        System.out.println(instrument.sound());
    }
}
