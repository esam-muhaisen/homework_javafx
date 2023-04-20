/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class system {
    public void start(Stage primaryStage) throws Exception {
//         FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
         FXMLLoader loader = new FXMLLoader(getClass().getResource("SystemPage.fxml"));
        Parent parent = loader.load();        
        Scene scene = new Scene(parent);        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
}
