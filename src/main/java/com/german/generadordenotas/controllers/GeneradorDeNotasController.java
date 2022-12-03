package com.german.generadordenotas.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GeneradorDeNotasController {

    @FXML
    private Label label;

    @FXML
    protected void generar() {
        label.setText("Eb");
    }
}