/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author 8ctia
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent mesaJogo = FXMLLoader.load(getClass().getResource("MesaJogo.fxml"));
        Scene mesaJogoScene = new Scene(mesaJogo); 
        Stage appMesa = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appMesa.setScene(mesaJogoScene);
        appMesa.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
