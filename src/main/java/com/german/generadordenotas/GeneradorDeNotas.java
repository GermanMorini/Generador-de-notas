package com.german.generadordenotas;

import atlantafx.base.theme.Dracula;
import atlantafx.base.theme.NordDark;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneradorDeNotas extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Application.setUserAgentStylesheet(new NordDark().getUserAgentStylesheet());
        FXMLLoader fxmlLoader = new FXMLLoader(GeneradorDeNotas.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        stage.setTitle("Generador de notas");
        stage.setMinHeight(600);
        stage.setMinWidth(1000);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}