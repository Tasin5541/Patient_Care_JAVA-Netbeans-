/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author User
 */
public class change_window {

    void change(String window) {
        FXMLLoader ld = new FXMLLoader(getClass().getResource(window));
        try {
            Parent root1 = (Parent) ld.load();
            Stage stage = new Stage();

//            if (window.equals("cardio1.fxml") || window.equals("cardio2.fxml") || window.equals("dentist1.fxml") || window.equals("dentist2.fxml")
//                    || window.equals("gastro1.fxml") || window.equals("gastro2.fxml") || window.equals("neuro1.fxml") || window.equals("neuro2.fxml")
//                    || window.equals("ortho1.fxml") || window.equals("ortho2.fxml") || window.equals("psy1.fxml") || window.equals("psy2.fxml")) 
//            {
//                stage.initStyle(StageStyle.TRANSPARENT);
//            }
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.sizeToScene();
            stage.show();

        } catch (IOException ex) {
            System.out.println("cant load page");
        }
    }
}
