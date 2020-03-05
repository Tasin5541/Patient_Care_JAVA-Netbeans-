/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Menu_pageController implements Initializable {

    @FXML
    private AnchorPane root;
    
    @FXML
    private AnchorPane menu_root;
    
    @FXML
    private JFXButton tour;

    @FXML
    private JFXButton treatment;

    @FXML
    private JFXButton doctor;
    
    @FXML
    private JFXButton username;

    @FXML
    private JFXButton direction;
    
    @FXML
    private JFXButton home_btn;

    @FXML
    void direction_action(ActionEvent event) throws IOException {
        doctor.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        treatment.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        tour.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        direction.setBackground(new Background(new BackgroundFill(Paint.valueOf("#2b2068"), CornerRadii.EMPTY, Insets.EMPTY)));

        AnchorPane pane=FXMLLoader.load(getClass().getResource("direction.fxml"));
        menu_root.getChildren().setAll(pane);
        
    }

    @FXML
    void doctor_action(ActionEvent event) throws IOException {
        doctor.setBackground(new Background(new BackgroundFill(Paint.valueOf("#2b2068"), CornerRadii.EMPTY, Insets.EMPTY)));
        treatment.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        tour.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        direction.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));

        AnchorPane pane=FXMLLoader.load(getClass().getResource("cmn_doctor.fxml"));
        menu_root.getChildren().setAll(pane);
    }

    @FXML
    void tour_action(ActionEvent event) throws IOException {
        tour.setBackground(new Background(new BackgroundFill(Paint.valueOf("#2b2068"), CornerRadii.EMPTY, Insets.EMPTY)));
        doctor.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        treatment.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
                //direction.setStyle("-fx-background-color:  #8a99bb;");
direction.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));

        AnchorPane pane=FXMLLoader.load(getClass().getResource("tour.fxml"));
        menu_root.getChildren().setAll(pane);
    }

    @FXML
    void treatment_action(ActionEvent event) throws IOException {
        doctor.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        treatment.setBackground(new Background(new BackgroundFill(Paint.valueOf("#2b2068"), CornerRadii.EMPTY, Insets.EMPTY)));
        tour.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));
        direction.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8a99bb"), CornerRadii.EMPTY, Insets.EMPTY)));

        AnchorPane pane=FXMLLoader.load(getClass().getResource("treatment.fxml"));
        menu_root.getChildren().setAll(pane);
    }
    
     @FXML
    void username_action(ActionEvent event) throws IOException {
//        change_window window=new change_window();
//        window.change("account.fxml");
//        Stage stage1=(Stage)username.getScene().getWindow();
//            stage1.close();
            
        AnchorPane pane=FXMLLoader.load(getClass().getResource("account.fxml"));
        root.getChildren().setAll(pane);
    }
    
     @FXML
    void home_btn_action(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource("home.fxml"));
        menu_root.getChildren().setAll(pane);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        username.setText(variable.username);
        try {
            
            AnchorPane pane=FXMLLoader.load(getClass().getResource("home.fxml"));
            menu_root.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(Menu_pageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
