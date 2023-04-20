/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class SystemPageController implements Initializable {

    @FXML
    private Button logout;
    @FXML
    private TextField nis;
    @FXML
    private TextField usd;
    @FXML
    private Button convert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void nis(ActionEvent event) {
    }

    @FXML
    private void usd(ActionEvent event) {
    }

    @FXML
    private void convert(ActionEvent event) {
    }
    
}
