/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311.form.pkg2;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jfurl
 */
public class Form2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLFormView.fxml"));
        
        Scene scene = new Scene(root,300,275);
        
        stage.setScene(scene);
        stage.setTitle("311");
        stage.show();
    }

    /**
     * @param args
     * @param  the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
