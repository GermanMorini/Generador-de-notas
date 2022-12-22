package com.german.generadordenotas.controller;

import com.german.generadordenotas.Note;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class NeckController extends Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: Revisar si realmente hacen falta todos estos campos
        Controller.firstStr = firstStr;
        Controller.secondStr = secondStr;
        Controller.thirdStr = thirdStr;
        Controller.fourthStr = fourthStr;
        Controller.fifthStr = fifthStr;
        Controller.sixthStr = sixthStr;
        Controller.seventStr = seventStr;
        Controller.eightStr = eightStr;
        Controller.neck = neck;

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

    @FXML
    private Button sharpBtn, flatBtn;

    @FXML
    private Label alterationLbl;

    private int counter = 0;

    protected static List<Note> getNeckValues() {
        List<Note> values = new ArrayList<>();
        Controller.neck.getChildren().forEach(n -> {
            values.add(((ChoiceBox<Note>) n).getValue());
        });
        return values;
    }

    @FXML
    protected void standardMIClick() {
        eightStr.setValue(Note.NONE);
        seventhStr.setValue(Note.NONE);
        sixthStr.setValue(Note.E);
        fifthStr.setValue(Note.A);
        fourthStr.setValue(Note.D);
        thirdStr.setValue(Note.G);
        secondStr.setValue(Note.B);
        firstStr.setValue(Note.E);

        alterNotes(counter);
    }

    @FXML
    protected void alterationLblClick() {
        alterNotes(-counter);
        counter = 0;
        alterationLbl.setText("0");
    }

    @FXML
    protected void sharpBtnClick() {
        counter++;
        alterationLbl.setText("" + counter);
        alterNotes(+1);
    }

    @FXML
    protected void flatBtnClick() {
        counter--;
        alterationLbl.setText("" + counter);
        alterNotes(-1);
    }

    private void alterNotes(int amount) {
        neck.getChildren().forEach(n -> {
            ChoiceBox<Note> cb = ((ChoiceBox<Note>) n);
            cb.setValue(cb.getValue().addSemitones(amount));
        });
    }
}
