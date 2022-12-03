package com.german.generadordenotas.controllers;

import com.german.generadordenotas.Note;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class NeckController extends Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Controller.setFirstStr(firstStr);
        Controller.setSecondStr(secondStr);
        Controller.setThirdStr(thirdStr);
        Controller.setFourthStr(fourthStr);
        Controller.setFifthStr(fifthStr);
        Controller.setSixthStr(sixthStr);
        Controller.setSeventStr(seventStr);
        Controller.setEightStr(eightStr);
    }

    @FXML
    private ChoiceBox<Note> firstStr, secondStr, thirdStr, fourthStr, fifthStr, sixthStr, seventhStr, eightStr;

    @FXML
    protected void click() {
        firstStr.getItems().add(Note.E);
        firstStr.setValue(Note.E);
    }
}
