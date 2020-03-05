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
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Appointment_ShowController implements Initializable {

    ObservableList<Book2> list = FXCollections.observableArrayList();

    @FXML
    private TableView<Book2> tableView;

    @FXML
    private TableColumn<Book2, String> DoctorCol;

    @FXML
    private TableColumn<Book2, String> dateCol;

    @FXML
    private TableColumn<Book2, String> timeCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initCol();
        loadData();
    }

    private void initCol() {
        DoctorCol.setCellValueFactory(new PropertyValueFactory<>("doctor"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
    }

    private void loadData() {
        LoginModel handler = new LoginModel();

        int i;
        String doctor=null,date=null,time=null;

        String col_name[] = {"cardio1", "cardio2", "dentist1", "dentist2", "gastro1", "gastro2",
            "neuro1", "neuro2", "ortho1", "ortho2", "psy1", "psy2"};

        for (i = 0; i < 12; i++) {
            String qu = "select * from doctor where " + col_name[i] + " ='" + variable.username + "'";
            ResultSet rs = null;
            rs = handler.execQuery(qu);
            try {
                while (rs.next()) {
                    switch (col_name[i]) {
                        case "cardio1":
                            doctor = "Dr. Shams Munwar";
                            date = "3 August 2017";
                            time = "10.30 a.m";
                            break;
                            
                            case "cardio2":
                                doctor = "Dr. A.Q.M. Reza";
                            date = "4 August 2017";
                            time = "4.30 p.m";
                            break;
                            
                            case "dentist1":
                            doctor = "Prof. (Dr.) Motiur Rahman Molla";
                            date = "5 August 2017";
                            time = "10.40 a.m";
                            break;
                            
                            case "dentist2":
                                doctor = "Dr. Kazi Hasinur Rahman";
                            date = "7 August 2017";
                            time = "4.30 p.m";
                            break;
                            
                            case "gastro1":
                            doctor = "Dr. Lutful L. Chowdhury";
                            date = "5 August 2017";
                            time = "11.30 a.m";
                            break;
                            
                            case "gastro2":
                                doctor = "Prof. Dr. Hafeza Aftab";
                            date = "4 August 2017";
                            time = "2.30 p.m";
                            break;
                            
                            case "neuro1":
                            doctor = "Prof. (Dr.) Mathew J. Chandy ";
                            date = "2 August 2017";
                            time = "3.00 p.m";
                            break;
                            
                            case "neuro2":
                                doctor = "Dr. Md. Aliuzzaman Joarder";
                            date = "4 August 2017";
                            time = "7.50 p.m";
                            break;
                            
                            case "ortho1":
                            doctor = "Dr. Nandkumar Katakdhond";
                            date = "7 August 2017";
                            time = "11.45 a.m";
                            break;
                            
                            case "ortho2":
                                doctor = "Dr. M. Ali";
                            date = "7 August 2017";
                            time = "7.30 p.m";
                            break;
                            
                            case "psy1":
                            doctor = "Dr. Mahmood Hasan";
                            date = "9 August 2017";
                            time = "11.00 a.m";
                            break;
                            
                            case "psy2":
                                doctor = "Dr. Nigar Sultana";
                            date = "8 August 2017";
                            time = "9.30 p.m";
                            break;
                    }

                    list.add(new Book2(doctor, date, time));

                }
            } catch (SQLException ex) {
                //Logger.getLogger(BookAddController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tableView.getItems().setAll(list);

    }

    public static class Book2 {

        private final SimpleStringProperty doctor;
        private final SimpleStringProperty date;
        private final SimpleStringProperty time;

        public Book2(String doctor, String date, String time) {
            this.doctor = new SimpleStringProperty(doctor);
            this.date = new SimpleStringProperty(date);
            this.time = new SimpleStringProperty(time);
        }

        public String getDoctor() {
            return doctor.get();
        }

        public String getDate() {
            return date.get();
        }

        public String getTime() {
            return time.get();
        }

    }

}
