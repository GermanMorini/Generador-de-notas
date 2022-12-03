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
        return symbol.matches("SIN USAR");
    }

    @Override
    public String toString() {
        return symbol;
    }
}
