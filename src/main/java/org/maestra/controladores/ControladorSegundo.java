package org.maestra.controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.maestra.MainApp;

import java.util.Objects;


public class ControladorSegundo {
    @FXML
    private Label segLabel;
    @FXML
    private Scene escena;
    @FXML
    private Stage escenario;
    @FXML
    public void muestraNombre(String nombreUsuario) {
        segLabel.setText("Hola " + nombreUsuario);
    }

    @FXML
    private void segBotonPulsado() {
        segLabel.setText("¡Prueba superada!");
    }


}

