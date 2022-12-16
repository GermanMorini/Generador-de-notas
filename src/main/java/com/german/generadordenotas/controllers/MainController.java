package com.german.generadordenotas.controllers;

import com.german.generadordenotas.model.Counter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;

import java.net.URL;
import java.util.*;

public class MainController extends Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Controller.setCounter(counter);
    }

    @FXML
    private ProgressIndicator counter;

    @FXML
    private Button comenzarBtn;

    private boolean comenzado = false;

    @FXML
    protected void btnClick() {
        comenzado = !comenzado;
        Counter c = new Counter(3);
        manageBtnText();
        if (!comenzado) {
            c.stop();
        }
    }

    private void manageBtnText() {
        if (comenzado) {
            comenzarBtn.setText("Detener");
        } else {
            comenzarBtn.setText("Comenzar");
        }
    }
}