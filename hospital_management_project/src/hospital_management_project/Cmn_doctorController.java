/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Cmn_doctorController implements Initializable {

    @FXML
    private AnchorPane cmn_doctor_root;
     
    @FXML
    private AnchorPane ortho;

    @FXML
    private AnchorPane gastro;

    @FXML
    private AnchorPane cardio;

    @FXML
    private AnchorPane neuro;

    @FXML
    private AnchorPane psych;

    @FXML
    private AnchorPane dentist;

    @FXML
    void cardio_action(MouseEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("cardio.fxml"));
        cmn_doctor_root.getChildren().setAll(pane);
    }

    @FXML
    void dentist_action(MouseEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("dentist.fxml"));
        cmn_doctor_root.getChildren().setAll(pane);
    }

    @FXML
    void gastro_action(MouseEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("gastro.fxml"));
        cmn_doctor_root.getChildren().setAll(pane);
    }

    @FXML
    void neuro_action(MouseEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("neuro.fxml"));
        cmn_doctor_root.getChildren().setAll(pane);
    }

    @FXML
    void ortho_action(MouseEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("orthopedician.fxml"));
        cmn_doctor_root.getChildren().setAll(pane);
    }

    @FXML
    void psych_action(MouseEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("psych.fxml"));
        cmn_doctor_root.getChildren().setAll(pane);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
