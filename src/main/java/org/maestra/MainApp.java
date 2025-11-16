package org.maestra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApp extends Application {
    public Parent raiz;
    @Override
    public void start(Stage escenario) throws Exception {

        try {
            raiz = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/maestra/VistaPrincipal.fxml")));

            Scene escena = new Scene(raiz, 600, 400);
            escena.getStylesheets().add(MainApp.class.getResource("style.css").toExternalForm());

            escenario.setScene(escena);
            escenario.setTitle("Intercambio vistas");
            escenario.show();

        } catch (Exception e) {
            e.printStackTrace();
        }


        /*
        FXMLLoader cargadorPrincipal = new FXMLLoader(getClass().getResource("VistaPrincipal.fxml"));

        Scene escena = new Scene(cargadorPrincipal.load(), 400, 200);
        escena.getStylesheets().add(MainApp.class.getResource("style.css").toExternalForm());

        escenario.setScene(escena);
        escenario.setTitle("Intercambio vistas");
        escenario.show();
        */

    }

    public static void main(String[] args) {
        launch(args);
    }
}
