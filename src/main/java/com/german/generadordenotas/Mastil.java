package com.german.generadordenotas;

import java.util.ArrayList;
import java.util.List;

public class Mastil {

    private List<GuitarString> stringSet = new ArrayList<GuitarString>();
    private int fretNumber;

    public Mastil(List<GuitarString> stringSet, int fretNumber) {
        this.stringSet = stringSet;
        this.fretNumber = fretNumber;
    }


}
