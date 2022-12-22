package com.german.generadordenotas.controller;

import com.german.generadordenotas.model.Afination;
import com.german.generadordenotas.model.Note;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class NeckController extends Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Controller.neck = neck;

        addAfinationsToMenu();

        eightStr.getItems().setAll(Note.values());
        seventhStr.getItems().setAll(Note.values());
        sixthStr.getItems().setAll(Note.values());
        fifthStr.getItems().setAll(Note.values());
        fourthStr.getItems().setAll(Note.values());
        thirdStr.getItems().setAll(Note.values());
        secondStr.getItems().setAll(Note.values());
        firstStr.getItems().setAll(Note.values());

        applyAfination(Afination.STANDARD1);
    }

    @FXML
    private ChoiceBox<Note> firstStr, secondStr, thirdStr, fourthStr, fifthStr, sixthStr, seventhStr, eightStr;

    @FXML
    private ContextMenu afinationMenu;

    @FXML
    private HBox neck;

    @FXML
    private Button sharpBtn, flatBtn;

    @FXML
    private Label alterationLbl;

    private int counter = 0;

    private void addAfinationsToMenu() {
        Afination[] afinations = Afination.values();
        for(Afination af : afinations) {
            MenuItem mi = new MenuItem();
            mi.setText(af.getName());
            mi.setOnAction(e -> {
                e.consume();
                applyAfination(af);
                alterNotes(counter);
            });
            afinationMenu.getItems().add(mi);
        };
    }

    protected void applyAfination(Afination a) {
        eightStr.setValue(a.get_8());
        seventhStr.setValue(a.get_7());
        sixthStr.setValue(a.get_6());
        fifthStr.setValue(a.get_5());
        fourthStr.setValue(a.get_4());
        thirdStr.setValue(a.get_3());
        secondStr.setValue(a.get_2());
        firstStr.setValue(a.get_1());
    }

    protected static List<Note> getNeckValues() {
        List<Note> values = new ArrayList<>();
        Controller.neck.getChildren().forEach(n -> {
            values.add(((ChoiceBox<Note>) n).getValue());
        });
        return values;
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
