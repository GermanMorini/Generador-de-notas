package com.german.generadordenotas;

public enum Note {
    C("C"),
    CSHP("-"),
    D("D"),
    DSHP("-"),
    E("E"),
    F("F"),
    FSHP("-"),
    G("G"),
    GSHP("-"),
    A("A"),
    ASHP("-"),
    B("B");

    private final String symbol;

    Note(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
