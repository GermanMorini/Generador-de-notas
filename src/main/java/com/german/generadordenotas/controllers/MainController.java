package com.german.generadordenotas.controllers;

import com.german.generadordenotas.Note;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainController extends Controller {

    @FXML
    private Label label;

    @FXML
    protected void generarBtnClick() {
        Random r = new Random();
        int randomStr = r.nextInt(8);

        Note n = getValues().get(randomStr);
        if (n.isNone()) {
            generarBtnClick();
        } else {
            stringLabel.setText("" + (8 - randomStr));
            noteLabel.setText(String.valueOf(Note.values()[r.nextInt(Note.values().length - 1) + 1]));
        }
    }

    private List<Note> getValues() {
        List<Note> values = new ArrayList<>();
        neck.getChildren().forEach(n -> {
            values.add(((ChoiceBox<Note>) n).getValue());
        });
        return values;
    }
}