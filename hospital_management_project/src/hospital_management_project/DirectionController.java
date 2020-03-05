/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DirectionController implements Initializable {

    
    @FXML
    private ImageView map_image;
    
    @FXML
    private JFXButton map_change;

    @FXML
    void map_change_action(ActionEvent event) {

        if(variable.map==0){
        Image image = new Image("satelite.png");
        map_image.setImage(image);
        variable.map=1;
        }
        else
        {
            Image image = new Image("map.png");
            map_image.setImage(image);
            variable.map=0;
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
