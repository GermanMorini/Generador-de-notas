module com.german.generadordenotas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires atlantafx.base;

    opens com.german.generadordenotas to javafx.fxml;
    exports com.german.generadordenotas;
    opens com.german.generadordenotas.controller to javafx.fxml;
    exports com.german.generadordenotas.controller;
    exports com.german.generadordenotas.model;
    opens com.german.generadordenotas.model to javafx.fxml;
}