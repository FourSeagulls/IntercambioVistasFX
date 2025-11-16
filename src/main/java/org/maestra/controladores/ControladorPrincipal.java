package org.maestra.controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorPrincipal {

    @FXML
    private TextField campo_entrada_principal;
    @FXML
    private Label priLabel;
    @FXML
    private Button btn_pri_pulsame;
    @FXML
    private Label priLabel2;

    private Stage escenario;
    private Scene escena;
    private Parent raiz;

    @FXML
    private void priBotonPulsado() {
        String nombreUsuario = campo_entrada_principal.getText();
        FXMLLoader cargaVistaSeg = new FXMLLoader(getClass().getResource("/org/maestra/VistaSegunda.fxml"));

        try {
            //raiz = cargador.load(getClass().getResource("/org/maestra/VistaSegunda.fxml").openStream());
            raiz = cargaVistaSeg.load();

            ControladorSegundo controlador = cargaVistaSeg.getController();
            controlador.muestraNombre(nombreUsuario);

            escenario = (Stage) btn_pri_pulsame.getScene().getWindow();
            escena = new Scene(raiz);
            escenario.setScene(escena);
            escenario.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //nombreUsuario = ((nombreUsuario == null) || nombreUsuario.trim().isEmpty()) ? "Amigo" : nombreUsuario.trim();

/*
        priLabel.setText("Has pulsado el botón "+nombreUsuario);
        btn_pri_pulsame.setText("¡Pulsado!");
        priLabel2.setText("¡¡¡ Ole !!!");
*/
    }
}
