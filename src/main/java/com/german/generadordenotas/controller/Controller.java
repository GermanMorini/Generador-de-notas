package com.german.generadordenotas.controller;

import com.german.generadordenotas.Note;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Controller {

    protected static ChoiceBox<Note> firstStr, secondStr, thirdStr, fourthStr, fifthStr, sixthStr, seventStr, eightStr;
    protected static Label noteLabel, stringLabel;
    protected static HBox neck;

    protected static void setNeck(HBox neck) {
        Controller.neck = neck;
    }

    protected static void setNoteLabel(Label noteLabel) {
        Controller.noteLabel = noteLabel;
    }

    protected static void setStringLabel(Label stringLabel) {
        Controller.stringLabel = stringLabel;
    }

    protected static void setFirstStr(ChoiceBox<Note> firstStr) {
        Controller.firstStr = firstStr;
    }

    protected static void setSecondStr(ChoiceBox<Note> secondStr) {
        Controller.secondStr = secondStr;
    }

    protected static void setThirdStr(ChoiceBox<Note> thirdStr) {
        Controller.thirdStr = thirdStr;
    }

    protected static void setFourthStr(ChoiceBox<Note> fourthStr) {
        Controller.fourthStr = fourthStr;
    }

    protected static void setFifthStr(ChoiceBox<Note> fifthStr) {
        Controller.fifthStr = fifthStr;
    }

    protected static void setSixthStr(ChoiceBox<Note> sixthStr) {
        Controller.sixthStr = sixthStr;
    }

    protected static void setSeventStr(ChoiceBox<Note> seventStr) {
        Controller.seventStr = seventStr;
    }

    protected static void setEightStr(ChoiceBox<Note> eightStr) {
        Controller.eightStr = eightStr;
    }
}
