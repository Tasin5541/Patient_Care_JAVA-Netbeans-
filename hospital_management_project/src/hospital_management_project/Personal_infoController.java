/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Personal_infoController implements Initializable {

    @FXML
    private ImageView pic;

    @FXML
    private Label name;

    @FXML
    private Label birthday;

    @FXML
    private Label gender;

    @FXML
    private Label email;

    @FXML
    private Label contact;

    @FXML
    private Label blood;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LoginModel handler = new LoginModel();
        String qu = "select * from login where name ='" + variable.username + "'";
        String picture =null,NAME=null,BIRTHDAY=null,GENDER=null,EMAIL=null,
                CONTACT=null,BLOOD=null;
        ResultSet rs = null;
        rs = handler.execQuery(qu);
        try {
            while (rs.next()) {
                picture = rs.getString("picture");  //database er clm er naam
                NAME = rs.getString("name");
                BIRTHDAY = rs.getString("date_of_birth");
                GENDER = rs.getString("gender");
                EMAIL = rs.getString("email");
                CONTACT = rs.getString("contact");
                BLOOD = rs.getString("blood_group");
               
            }
        } catch (SQLException ex) {
            //Logger.getLogger(BookAddController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image image2 = new Image(picture);
        pic.setImage(image2);
        
        name.setText(NAME);
        birthday.setText(BIRTHDAY);
        gender.setText(GENDER);
        email.setText(EMAIL);
        contact.setText(CONTACT);
        blood.setText(BLOOD);
    }    
    
}
