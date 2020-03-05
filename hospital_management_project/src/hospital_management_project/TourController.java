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
public class TourController implements Initializable {

    @FXML
    private ImageView tour_image;
    
    @FXML
    private JFXButton next;

    @FXML
    private JFXButton prev;

    @FXML
    void next_action(ActionEvent event) {
        variable.tour++;
        
        if(variable.tour==9)
            variable.tour=1;
        
        if(variable.tour<9)
        {
            switch(variable.tour)
            {
                case 1:
                    Image image = new Image("25748487.jpg");
                    tour_image.setImage(image);
                    break;
                case 2:
                    Image image2 = new Image("11.jpg");
                    tour_image.setImage(image2);
                    break;
                case 3:
                    Image image3 = new Image("dhaka5.jpg");
                    tour_image.setImage(image3);
                    break;
                case 4:
                    Image image4 = new Image("glry_g8_2013081227.jpg");
                    tour_image.setImage(image4);
                    break;
                case 5:
                    Image image5 = new Image("glry_g16_2013081234.jpg");
                    tour_image.setImage(image5);
                    break;
                case 6:
                    Image image6 = new Image("glry_g18_2013081234.jpg");
                    tour_image.setImage(image6);
                    break;
                case 7:
                    Image image7 = new Image("glry_g21_2013081234.jpg");
                    tour_image.setImage(image7);
                    break;
                case 8:
                    Image image8 = new Image("glry_g23_2013081234.jpg");
                    tour_image.setImage(image8);
                    break;
            }
        }
        
    }

    @FXML
    void prev_action(ActionEvent event) {
        variable.tour--;
        
        if(variable.tour==0)
            variable.tour=8;
        
        if(variable.tour<9)
        {
            switch(variable.tour)
            {
                case 1:
                    Image image = new Image("25748487.jpg");
                    tour_image.setImage(image);
                    break;
                case 2:
                    Image image2 = new Image("11.jpg");
                    tour_image.setImage(image2);
                    break;
                case 3:
                    Image image3 = new Image("dhaka5.jpg");
                    tour_image.setImage(image3);
                    break;
                case 4:
                    Image image4 = new Image("glry_g8_2013081227.jpg");
                    tour_image.setImage(image4);
                    break;
                case 5:
                    Image image5 = new Image("glry_g16_2013081234.jpg");
                    tour_image.setImage(image5);
                    break;
                case 6:
                    Image image6 = new Image("glry_g18_2013081234.jpg");
                    tour_image.setImage(image6);
                    break;
                case 7:
                    Image image7 = new Image("glry_g21_2013081234.jpg");
                    tour_image.setImage(image7);
                    break;
                case 8:
                    Image image8 = new Image("glry_g23_2013081234.jpg");
                    tour_image.setImage(image8);
                    break;
            }
        }
        
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
