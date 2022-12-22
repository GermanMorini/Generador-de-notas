package com.german.generadordenotas;

public enum Note {
    NONE("SIN USAR"),
    C("C"),
    CSHP("C#"),
    D("D"),
    DSHP("D#"),
    E("E"),
    F("F"),
    FSHP("F#"),
    G("G"),
    GSHP("G#"),
    A("A"),
    ASHP("A#"),
    B("B");

    private final String symbol;

    Note(String symbol) {
        this.symbol = symbol;
    }

    public boolean isNone() {
        return this.ordinal() == 0;
    }

    public Note addSemitones(int st) {
        if (!this.isNone()) return addSemitones(this, st);
        return this;
    }

    public static Note addSemitones(Note n, int st) {
        st = Math.floorMod(st, 12);
        try {
            return Note.values()[n.ordinal() + st];
        } catch (IndexOutOfBoundsException e) {
            return addSemitones(C, st - (13 - n.ordinal()));
        }
    }

    @Override
    public String toString() {
        return symbol;
    }
}
