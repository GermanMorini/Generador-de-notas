package com.german.generadordenotas.controllers;

import com.german.generadordenotas.Note;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainController extends Controller {

    @FXML
    private Label label;

    @FXML
    private TextField trastesTF;

    @FXML
    protected void generarBtnClick() {
        Random r = new Random();
        int randomStr = r.nextInt(8);

        Note n = getNeckValues().get(randomStr);
        if (n.isNone()) {
            generarBtnClick();
        } else {
            stringLabel.setText("" + (8 - randomStr));
            noteLabel.setText(Note.addSemitones(n, r.nextInt(Integer.parseInt(trastesTF.getText()))).toString());
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