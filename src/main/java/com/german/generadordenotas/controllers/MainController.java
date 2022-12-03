package com.german.generadordenotas.controllers;

import com.german.generadordenotas.Note;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MainController extends Controller {

    @FXML
    private Label label;

    @FXML
    protected void generarBtnClick() {

    }

    public int countStrings() {
        AtomicInteger n = new AtomicInteger();
        getValues().forEach(note -> {if(!note.isNone()) n.getAndIncrement();});
        return n.get();
    }

    private List<Note> getValues() {
        List<Note> values = new ArrayList<Note>();
        neck.getChildren().forEach(c -> {
            values.add(((ChoiceBox<Note>) c).getValue());
        });
        return values;
    }
}