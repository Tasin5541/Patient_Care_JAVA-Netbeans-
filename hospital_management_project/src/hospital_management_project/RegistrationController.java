
package hospital_management_project;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import java.io.File;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class RegistrationController implements Initializable {

    LoginModel loginModel = new LoginModel();

    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField repassword;

    @FXML
    private JFXTextField contact;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXCheckBox femalebox;

    @FXML
    private JFXCheckBox malebox;

    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXComboBox<String> blood;

    @FXML
    private JFXButton submit;

    @FXML
    private ImageView pic;

    @FXML
    private JFXButton pic_btn;

    public String gender="",  picture = "";
    
    @FXML
    private JFXButton cancel;

    @FXML
    void cancel_action(ActionEvent event) {
        change_window chng = new change_window();
                        chng.change("login.fxml");
                        Stage stage1 = (Stage) cancel.getScene().getWindow();
                        stage1.close();
    }

    @FXML
    void femalebox_action(ActionEvent event) {
        if (femalebox.isSelected()) {
            gender = "Female";
            malebox.setSelected(false);
        }
    }

    @FXML
    void malebox_action(ActionEvent event) {
        if (malebox.isSelected()) {
            gender = "Male";
            femalebox.setSelected(false);
        }
    }

    @FXML
    void pic_btn_action(ActionEvent event) {
        final FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(new Stage());

        if (file != null) {
            Image image1 = new Image(file.toURI().toString());
            picture = file.toURI().toString();
            System.out.println(file.toURI().toString());
            pic.setImage(image1);
        }
    }

    @FXML
    void submit_action(ActionEvent event) {
        if (!name.getText().equals("") && !password.getText().equals("") && !repassword.getText().equals("") && date.getValue()!=null && !email.getText().equals("") && !contact.getText().equals("") && !blood.getValue().toString().equals("") && !picture.equals("") && !gender.equals("")) {
            
            if (password.getText().equals(repassword.getText())) {
                try {
                    if (loginModel.isSignup(name.getText(), password.getText(), date.getValue().toString(), gender, email.getText(), contact.getText(), blood.getValue().toString(), picture)) {
                        variable.title = "Registration Completed";
                        variable.text = "Login to Continue";
                        new dwnld().start();

                        change_window chng = new change_window();
                        chng.change("login.fxml");
                        Stage stage1 = (Stage) submit.getScene().getWindow();
                        stage1.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrationController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                variable.title = "Registration Unsuccessful";
                variable.text = "Passwords Do Not Match";
                new dwnld().start();
            }

        } else {

            variable.title = "Registration Unsuccessful";
            variable.text = "Fillup All The Fields";
            new dwnld().start();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        blood.getItems().removeAll(blood.getItems());
        blood.getItems().addAll("O+", "O-", "B+", "B-", "A+", "A-", "AB+");
        blood.getSelectionModel().select("O+");
        
        
        NumberValidator validator = new NumberValidator();
        contact.getValidators().add(validator);
        
        validator.setMessage("Only Numbers Allowed");
        validator.setStyle("-fx-text-color: #8a99bb;");
        contact.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if(!newValue)
                {
                    contact.validate();
                }
            }
        }
        
        );
    }
   
}
