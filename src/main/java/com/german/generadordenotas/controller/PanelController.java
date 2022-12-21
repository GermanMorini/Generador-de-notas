package com.german.generadordenotas.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PanelController extends Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Controller.setNoteLabel(noteLabel);
        Controller.setStringLabel(stringLabel);
    }

    @FXML
    private Label noteLabel, stringLabel;
}
