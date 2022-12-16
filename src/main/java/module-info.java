module com.german.generadordenotas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.german.generadordenotas to javafx.fxml;
    exports com.german.generadordenotas;
    opens com.german.generadordenotas.controllers to javafx.fxml;
    exports com.german.generadordenotas.controllers;
}