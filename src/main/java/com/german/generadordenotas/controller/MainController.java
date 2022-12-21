package com.german.generadordenotas.controller;

import com.german.generadordenotas.Note;
import com.german.generadordenotas.model.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
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

        Note n = getNeckValues().get(randomStr);
        if (n.isNone()) {
            generarBtnClick();
        } else {
            int start = parseInt(startTf.getText());
            int end = parseInt(endTf.getText());

            stringLabel.setText("" + (8 - randomStr));
            noteLabel.setText(Note.addSemitones(n, r.nextInt(start , end + 1)).toString());
        }
    }

    private List<Note> getNeckValues() {
        List<Note> values = new ArrayList<>();
        neck.getChildren().forEach(n -> {
            values.add(((ChoiceBox<Note>) n).getValue());
        });
        return values;
    }
}