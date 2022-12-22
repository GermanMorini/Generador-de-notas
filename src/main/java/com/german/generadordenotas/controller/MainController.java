package com.german.generadordenotas.controller;

import com.german.generadordenotas.model.Note;
import com.german.generadordenotas.model.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainController extends Controller {

    @FXML
    private Label label;

    @FXML
    private TextField startTf, endTf;

    @FXML
    protected void generarBtnClick() {
        try {
            pickRandomNote();
        } catch (IllegalArgumentException e) {
            Utils.showMessageDialog("Prueba revisar el número de trastes", e.getMessage());
        }
    }

    private void pickRandomNote() throws IllegalArgumentException {
        Random r = new Random();
        int randomStr = r.nextInt(8);

        Note n = NeckController.getNeckValues().get(randomStr);
        if (n.isNone()) {
            generarBtnClick();
        } else {
            int start = parseInt(startTf.getText());
            int end = parseInt(endTf.getText());

            stringLabel.setText("" + (8 - randomStr));
            noteLabel.setText(Note.addSemitones(n, r.nextInt(start , end + 1)).toString());
        }
    }
}