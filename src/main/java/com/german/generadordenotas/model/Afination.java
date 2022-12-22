package com.german.generadordenotas.model;

import static com.german.generadordenotas.model.Note.*;

public enum Afination {
    NINGUNA("Sin cuerdas (--------)", NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
    STANDARD1("Estandar ('EADGBE)", NONE, NONE, E, A, D, G, B, E),
    STANDARD2("Estandar ('BEADGBE)", NONE, B, E, A, D, G, B, E),
    STANDARD3("Estandar (GBEADGBE)", G, B, E, A, D, G, B, E),
    TRES_PRIMERAS("Tres primeras ('GBE)", NONE, NONE, NONE, NONE, NONE, G, B ,E),
    TRES_ULTIMAS("Tres últimas (EAD')", NONE, NONE, E, A, D, NONE, NONE, NONE),
    DOS_ULTIMAS("Dos últimas (GB')", G, B, NONE, NONE, NONE, NONE, NONE, NONE),
    DROP_D("Drop D ('DADGBE)", NONE, NONE, D, A, D, G, B, E),
    DROP_C("Drop C ('CADGBE)", NONE, NONE, C, A, D, G, B, E);

    private final String name;
    private final Note _8, _7, _6, _5, _4, _3, _2, _1;

    Afination(String name, Note _8, Note _7, Note _6, Note _5, Note _4, Note _3, Note _2, Note _1) {
        this.name = name;
        this._8 = _8;
        this._7 = _7;
        this._6 = _6;
        this._5 = _5;
        this._4 = _4;
        this._3 = _3;
        this._2 = _2;
        this._1 = _1;
    }

    public String getName() {
        return name;
    }

    public Note get_8() {
        return _8;
    }

    public Note get_7() {
        return _7;
    }

    public Note get_6() {
        return _6;
    }

    public Note get_5() {
        return _5;
    }

    public Note get_4() {
        return _4;
    }

    public Note get_3() {
        return _3;
    }

    public Note get_2() {
        return _2;
    }

    public Note get_1() {
        return _1;
    }
}
