package com.german.generadordenotas;

public class GuitarString {

    private Note tuning;

    public GuitarString(Note tuning) {
        this.tuning = tuning;
    }

    public void changeTuning(Note newTuning) {
        tuning = newTuning;
    }

    public Note getTuning() {
        return tuning;
    }
}
