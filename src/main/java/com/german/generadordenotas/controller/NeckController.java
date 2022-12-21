package com.german.generadordenotas.controller;

import com.german.generadordenotas.Note;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

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
        Controller.setNeck(neck);

        eightStr.getItems().setAll(Note.values());
        eightStr.setValue(Note.NONE);

        seventhStr.getItems().setAll(Note.values());
        seventhStr.setValue(Note.NONE);

        sixthStr.getItems().setAll(Note.values());
        sixthStr.setValue(Note.E);

        fifthStr.getItems().setAll(Note.values());
        fifthStr.setValue(Note.A);

        fourthStr.getItems().setAll(Note.values());
        fourthStr.setValue(Note.D);

        thirdStr.getItems().setAll(Note.values());
        thirdStr.setValue(Note.G);

        secondStr.getItems().setAll(Note.values());
        secondStr.setValue(Note.B);

        firstStr.getItems().setAll(Note.values());
        firstStr.setValue(Note.E);
    }

    @FXML
    private ChoiceBox<Note> firstStr, secondStr, thirdStr, fourthStr, fifthStr, sixthStr, seventhStr, eightStr;

    @FXML
    private HBox neck;

}
