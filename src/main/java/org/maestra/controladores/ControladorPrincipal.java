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
    private Label etiqueta_principal;
    @FXML
    private Button btn_principal;
    @FXML
    private Label etiqueta_principal1;

    private Stage escenario;
    private Scene escena;
    private Parent raiz;

    @FXML
    public void btn_principal_pulsado() {
        String nombreUsuario = campo_entrada_principal.getText();
        FXMLLoader cargaVistaSegunda = new FXMLLoader(getClass().getResource("/org/maestra/VistaSegunda.fxml"));

        try {
            //raiz = cargador.load(getClass().getResource("/org/maestra/VistaSegunda.fxml").openStream());
            raiz = cargaVistaSegunda.load();

            ControladorSegundo controladorSegundo = cargaVistaSegunda.getController();
            controladorSegundo.saludaNombre(nombreUsuario);
            controladorSegundo.nombreUsuario = nombreUsuario;

            escenario = (Stage) btn_principal.getScene().getWindow();
            escena = new Scene(raiz);
            escenario.setScene(escena);
            escenario.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
