package com.german.generadordenotas.model;

public enum Note {
    NONE("SIN USAR", "SIN USAR"),
    C("C", "B#"),
    CSHP("C#", "Db"),
    D("D", "C##"),
    DSHP("D#", "Eb"),
    E("E", "Fb"),
    F("F", "E#"),
    FSHP("F#", "Gb"),
    G("G", "Abb"),
    GSHP("G#", "Ab"),
    A("A", "G##"),
    ASHP("A#", "Bb"),
    B("B", "Cb");

    private final String symbol1, symbol2;

    Note(String symbol1, String symbol2) {
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
    }

    public boolean isNone() {
        return this.ordinal() == 0;
    }

    public Note changeNote(int st) {
        if (!this.isNone()) return changeNote(this, st);
        return this;
    }

    public static Note changeNote(Note n, int semitones) {
        semitones = Math.floorMod(semitones, 12);
        try {
            return Note.values()[n.ordinal() + semitones];
        } catch (IndexOutOfBoundsException e) {
            return changeNote(C, semitones - (13 - n.ordinal()));
        }
    }

    @Override
    public String toString() {
        return symbol1;
    }

    public String toString(boolean b) {
        if(b) return symbol1;
        return symbol2;
    }
}
