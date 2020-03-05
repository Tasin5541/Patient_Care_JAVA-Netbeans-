/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import static hospital_management_project.AccountController.rootP;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Menu_drawerController implements Initializable {

    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    void menu_change(ActionEvent event) throws IOException {
        JFXButton btn = (JFXButton) event.getSource();
        switch(btn.getText())
        {
            case "Medical Records" :
                AnchorPane pane1=FXMLLoader.load(getClass().getResource("medical_record.fxml"));
                rootP.getChildren().setAll(pane1);
                break;
            case "Appointments" :
                AnchorPane pane3=FXMLLoader.load(getClass().getResource("appointment_Show.fxml"));
                rootP.getChildren().setAll(pane3);
                break;
            case "Personal info." :
                AnchorPane pane2=FXMLLoader.load(getClass().getResource("personal_info.fxml"));
                rootP.getChildren().setAll(pane2);
                break;
            case "Logout" :
                change_window chng=new change_window();
            chng.change("login.fxml");
            Stage stage1=(Stage)btn4.getScene().getWindow();
            stage1.close();
                break;
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
