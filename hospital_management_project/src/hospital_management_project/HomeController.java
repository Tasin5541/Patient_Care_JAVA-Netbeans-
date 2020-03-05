/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class HomeController implements Initializable {

    @FXML
    private ImageView imageview;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image1 = new Image("1.jpg");
        Image image2 = new Image("2.jpg");
        Image image3 = new Image("3.jpg");
        Image image4 = new Image("4.png");
        Image image5 = new Image("5.jpg");
        
        KeyFrame kf1=new KeyFrame(Duration.ZERO, new KeyValue(imageview.imageProperty(), image1));
        KeyFrame kf2=new KeyFrame(Duration.seconds(2), new KeyValue(imageview.imageProperty(), image2));
        KeyFrame kf3=new KeyFrame(Duration.seconds(4), new KeyValue(imageview.imageProperty(), image3));
        KeyFrame kf4=new KeyFrame(Duration.seconds(6), new KeyValue(imageview.imageProperty(), image4));
        KeyFrame kf5=new KeyFrame(Duration.seconds(8), new KeyValue(imageview.imageProperty(), image5));
        KeyFrame kf6=new KeyFrame(Duration.seconds(10), new KeyValue(imageview.imageProperty(), image5));
        
        Timeline timeline = new Timeline(kf1,kf2,kf3,kf4,kf5,kf6);
        
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }    
    
}
