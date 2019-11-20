/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311.form.pkg2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 *
 * @author jfurl
 */
public class FXMLFORMController  {
    
 
       @FXML private Text actiontarget;
    
 
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button ");
    }
    
     
        // TODO
    
    
}
