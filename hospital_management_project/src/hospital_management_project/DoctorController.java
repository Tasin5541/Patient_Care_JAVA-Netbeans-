/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DoctorController implements Initializable {

    @FXML
    private AnchorPane ortho1;
    
    @FXML
    private AnchorPane ortho2;
    
    @FXML
    private AnchorPane cardio1;

    @FXML
    private AnchorPane cardio2;
    
    @FXML
    private AnchorPane dentist1;

    @FXML
    private AnchorPane dentist2;
    
     @FXML
    private AnchorPane gastro1;

    @FXML
    private AnchorPane gastro2;
    
    @FXML
    private AnchorPane neuro1;

    @FXML
    private AnchorPane neuro2;
    
    @FXML
    private AnchorPane psy1;

    @FXML
    private AnchorPane psy2;

    @FXML
    void psy1_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("psy1.fxml");
    }

    @FXML
    void psy2_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("psy2.fxml");
    }

    @FXML
    void neuro1_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("neuro1.fxml");
    }

    @FXML
    void neuro2_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("neuro2.fxml");
    }

    @FXML
    void gastro1_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("gastro1.fxml");
    }

    @FXML
    void gastro2_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("gastro2.fxml");
    }

    @FXML
    void dentist1_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("dentist1.fxml");
    }

    @FXML
    void dentist2_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("dentist2.fxml");
    }

    @FXML
    void cardio1_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("cardio1.fxml");
    }

    @FXML
    void cardio2_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("cardio2.fxml");
    }

    @FXML
    void ortho1_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("ortho1.fxml");
    }
    
    @FXML
    void ortho2_action(MouseEvent event) {
        change_window chng=new change_window();
                chng.change("ortho2.fxml");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
