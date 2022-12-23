package com.german.generadordenotas.model;

public enum Note {
    NONE("SIN USAR", "", ""),
    C("C", "Dbb", "B#"),
    CSHP("C#", "Db", "B##"),
    D("D", "Ebb", "C##"),
    DSHP("D#", "Eb", "Fbb"),
    E("E", "Fb", "D##"),
    F("F", "Gbb", "E#"),
    FSHP("F#", "Gb", "E##"),
    G("G", "Abb", "F##"),
    GSHP("G#", "Ab", "Ab"),
    A("A", "Bbb", "G##"),
    ASHP("A#", "Bb", "Cbb"),
    B("B", "Cb", "A##");

    private final String symbol1, symbol2, symbol3;

    Note(String symbol1, String symbol2, String symbol3) {
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
        this.symbol3 = symbol3;
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

    public String toString(int n) {
        return switch (n) {
            case 1 -> symbol1;
            case 2 -> symbol2;
            default -> symbol3;
        };
    }
}
