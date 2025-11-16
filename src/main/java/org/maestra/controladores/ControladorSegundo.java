package org.maestra.controladores;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ControladorSegundo {
    @FXML
    private TextField campo_entrada_principal;
    @FXML
    private Label etiqueta_segunda;
    @FXML
    private Label etiqueta_segunda1;
    @FXML
    private Scene escena;
    @FXML
    private Stage escenario;
    @FXML
    private Parent raiz;
    @FXML
    private Button btn_no_toques;
    @FXML
    public String nombreUsuario;
    @FXML
    public void saludaNombre(String nombreUsuario) {
        etiqueta_segunda.setText("Hey colega " + nombreUsuario);
    }
    @FXML
    public String dimeNombre(){
        return nombreUsuario;
    }

    @FXML
    private void btn_pulsame_pulsado() {
        etiqueta_segunda.setText("¡Prueba superada!");
    }


    @FXML
    public void  btn_no_toques_pulsado() {
        System.out.println("Botón btn_no_toques pulsado");
        saludaNombre(nombreUsuario);
        etiqueta_segunda1.setText("Lo está haciendo muy bien " + nombreUsuario);
    }

}

