package com.german.generadordenotas.controllers;

import com.german.generadordenotas.Note;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller {

    protected static ChoiceBox<Note> firstStr, secondStr, thirdStr, fourthStr, fifthStr, sixthStr, seventStr, eightStr;
    protected static Label noteLabel, stringLabel;

    public static void setNoteLabel(Label noteLabel) {
        Controller.noteLabel = noteLabel;
    }

    public static void setStringLabel(Label stringLabel) {
        Controller.stringLabel = stringLabel;
    }

    public static void setFirstStr(ChoiceBox<Note> firstStr) {
        Controller.firstStr = firstStr;
    }

    public static void setSecondStr(ChoiceBox<Note> secondStr) {
        Controller.secondStr = secondStr;
    }

    public static void setThirdStr(ChoiceBox<Note> thirdStr) {
        Controller.thirdStr = thirdStr;
    }

    public static void setFourthStr(ChoiceBox<Note> fourthStr) {
        Controller.fourthStr = fourthStr;
    }

    public static void setFifthStr(ChoiceBox<Note> fifthStr) {
        Controller.fifthStr = fifthStr;
    }

    public static void setSixthStr(ChoiceBox<Note> sixthStr) {
        Controller.sixthStr = sixthStr;
    }

    public static void setSeventStr(ChoiceBox<Note> seventStr) {
        Controller.seventStr = seventStr;
    }

    public static void setEightStr(ChoiceBox<Note> eightStr) {
        Controller.eightStr = eightStr;
    }
}
