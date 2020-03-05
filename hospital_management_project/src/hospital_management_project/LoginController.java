/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginController implements Initializable {

    LoginModel loginmodel=new LoginModel();
    
    @FXML
    private AnchorPane login_root;
    
    @FXML
    private JFXTextField name;

    @FXML
    private JFXPasswordField pass;
    
    @FXML
    private JFXButton login;
    
    @FXML
    private JFXButton reg;
    
    public static AnchorPane rootP;

    @FXML
    void login_action(ActionEvent event) {
        try {
            if (loginmodel.isLogin(name.getText(),pass.getText())) {
                variable.username=name.getText();
                change_window chng=new change_window();
                chng.change("menu_page.fxml");
                Stage stage1=(Stage)login.getScene().getWindow();
                stage1.close();
            } else {
                variable.title="Login Unsuccessful";
                variable.text="username or password do not match";
                new dwnld().start();
                //JOptionPane.showMessageDialog(null, "username or password do not match");
            } //Logger.getLogger(database_connectionController.class.getName()).log(Level.SEVERE, null, ex);
            //isConnected.setText("unsuccessful");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "username or password do not match");
            //Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

//        if(name.getText().equalsIgnoreCase("tasin") && pass.getText().equalsIgnoreCase("123"))
//        {
//            variable.username=name.getText();
//            change_window chng=new change_window();
//            chng.change("menu_page.fxml");
//            Stage stage1=(Stage)login.getScene().getWindow();
//            stage1.close();
//        }
    }
    
    @FXML
    void reg_action(ActionEvent event) throws IOException {
//        AnchorPane pane=FXMLLoader.load(getClass().getResource("registration.fxml"));
//        login_root.getChildren().setAll(pane);

change_window chng=new change_window();
            chng.change("registration.fxml");
            Stage stage1=(Stage)login.getScene().getWindow();
            stage1.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (!Hospital_management_project.isSplashLoaded) {
            loadSplashScreen();
        }
        
        rootP = login_root;
        
        
        
        RequiredFieldValidator validator = new RequiredFieldValidator();
        name.getValidators().add(validator);
        validator.setMessage("No Username Given");
        
        name.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue)
                {
                    name.validate();
                }
            }
        }
        
        );
        
        RequiredFieldValidator validator2 = new RequiredFieldValidator();
        pass.getValidators().add(validator2);
        validator2.setMessage("No Password Given");
        
        pass.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue)
                {
                    pass.validate();
                }
            }
        }
        
        );
    }    
    
    
    private void loadSplashScreen() {
        try {
            Hospital_management_project.isSplashLoaded = true;
            
            StackPane pane = FXMLLoader.load(getClass().getResource(("splashFXML.fxml")));
            login_root.getChildren().setAll(pane);

            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);

            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeIn.play();

            fadeIn.setOnFinished((e) -> {
            FadeTransition fadeIn3 = new FadeTransition(Duration.seconds(4), pane);
            fadeIn3.setCycleCount(1);
                
                fadeOut.play();
            });

            fadeOut.setOnFinished((e) -> {
                Hospital_management_project.isSplashLoaded2 = true;
        try {
            AnchorPane pane2 = FXMLLoader.load(getClass().getResource(("loading_page.fxml")));
            login_root.getChildren().setAll(pane2);
            FadeTransition fadeIn2 = new FadeTransition(Duration.seconds(2), pane2);
            fadeIn2.setCycleCount(1);

            FadeTransition fadeOut2 = new FadeTransition(Duration.seconds(2), pane2);
            fadeOut2.setCycleCount(1);

            fadeIn2.play();

            fadeIn2.setOnFinished((f) -> {
                fadeOut2.play();
            });

            fadeOut2.setOnFinished((f) -> {
                try {
                    AnchorPane parentContent = FXMLLoader.load(getClass().getResource(("login.fxml")));
                    login_root.getChildren().setAll(parentContent);

                } catch (IOException ex) {
                    //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(SplashFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
            });

        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
