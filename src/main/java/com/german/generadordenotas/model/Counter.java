package com.german.generadordenotas.model;

import com.german.generadordenotas.Note;
import com.german.generadordenotas.controllers.Controller;
import javafx.scene.control.ChoiceBox;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;

public class Counter {

    private Timer sorterCounter, timeCounter;

    public Counter(double delayInSeconds) {
        sorterCounter = new Timer((int) delayInSeconds * 1000, (ActionEvent e) -> {
           sortNotes();
        });

        timeCounter = new Timer((int) (delayInSeconds * 1000) / 5, (ActionEvent e) -> {
            Controller.counter.setProgress(Controller.counter.getProgress() + 0.2);
        });

        sorterCounter.start();
        timeCounter.start();
    }

    public void stop() {
        sorterCounter.stop();
        timeCounter.stop();
    }

    private void sortNotes() {
        Random r = new Random();
        int randomStr = r.nextInt(8);

        Note n = getValues().get(randomStr);
        if (n.isNone()) {
            sortNotes();
        } else {
            Controller.stringLabel.setText("" + (8 - randomStr));
            Controller.noteLabel.setText(n.toString());
        }
    }

    private List<Note> getValues() {
        List<Note> values = new ArrayList<>();
        Controller.neck.getChildren().forEach(n -> {
            values.add(((ChoiceBox<Note>) n).getValue());
        });
        return values;
    }
}
