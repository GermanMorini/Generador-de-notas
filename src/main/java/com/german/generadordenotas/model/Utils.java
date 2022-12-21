package com.german.generadordenotas.model;

import javafx.scene.control.Alert;

public class Utils {
    private static final java.awt.Dimension DIMENSION = new java.awt.Dimension(600, 420);

    public static void showMessageDialog(String msg, String title) {
        Alert al = new Alert(Alert.AlertType.WARNING, msg);
        al.setHeight(DIMENSION.height);
        al.setWidth(DIMENSION.width);
        al.setTitle(title);
        al.show();
    }
}
