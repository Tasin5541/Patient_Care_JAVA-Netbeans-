/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author User
 */
public class NeuroController implements Initializable {

    LoginModel loginModel = new LoginModel();
    
    @FXML
    private JFXButton n2;

    @FXML
    private JFXButton n1;

    @FXML
    void n1_action(ActionEvent event) {
        try {
            if (loginModel.isBook(variable.username,"neuro1")) {
                variable.title = "Successful";
                variable.text = "Appointment Booked";
                new dwnld().start();
            }   } catch (SQLException ex) {
            Logger.getLogger(CardioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void n2_action(ActionEvent event) {
        try {
            if (loginModel.isBook(variable.username,"neuro2")) {
                variable.title = "Successful";
                variable.text = "Appointment Booked";
                new dwnld().start();
            }   } catch (SQLException ex) {
            Logger.getLogger(CardioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
