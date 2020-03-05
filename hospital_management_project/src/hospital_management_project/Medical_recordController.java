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


public class Medical_recordController implements Initializable {

    ObservableList<Book> list = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Book> tableView;

    @FXML
    private TableColumn<Book, String> discomfortscol;

    @FXML
    private TableColumn<Book, String> doctorcol;

    @FXML
    private TableColumn<Book, String> evaluationcol;

    @FXML
    private TableColumn<Book, String> medicationcol;

    @FXML
    private TableColumn<Book, String> treatmentscol;

    @FXML
    private TableColumn<Book, String> suffering_periodcol;

    @FXML
    private TableColumn<Book, String> statuscol;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(variable.username.equals("Tasin") || variable.username.equals("Deepak") || variable.username.equals("Ifti")){
        initCol();
        loadData();
        }
    }  
    
    private void initCol() {
        discomfortscol.setCellValueFactory(new PropertyValueFactory<>("discomforts"));
        doctorcol.setCellValueFactory(new PropertyValueFactory<>("doctor"));
        evaluationcol.setCellValueFactory(new PropertyValueFactory<>("evaluation"));
        medicationcol.setCellValueFactory(new PropertyValueFactory<>("medication"));
        treatmentscol.setCellValueFactory(new PropertyValueFactory<>("treatments"));
        suffering_periodcol.setCellValueFactory(new PropertyValueFactory<>("suffering_period"));
        statuscol.setCellValueFactory(new PropertyValueFactory<>("current_status"));
    }

    private void loadData() {
        LoginModel handler = new LoginModel();
        
        String qu = "select * from " + variable.username.toLowerCase();
        ResultSet rs = null;
        rs = handler.execQuery(qu);
        try {
            while (rs.next()) {
                String discomforts = rs.getString("discomforts");
                String doctor = rs.getString("doctor");
                String evaluation = rs.getString("evaluation");
                String medication = rs.getString("medication");
                String treatments = rs.getString("treatments");
                String suffering_period = rs.getString("suffering_period");
                String current_status = rs.getString("current_status");
               
                list.add(new Book(discomforts, doctor, evaluation, medication, treatments, suffering_period, current_status));
               
            }
        } catch (SQLException ex) {
            //Logger.getLogger(BookAddController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tableView.getItems().setAll(list);
        
    }

    public static class Book {

        private final SimpleStringProperty discomforts;
        private final SimpleStringProperty doctor;
        private final SimpleStringProperty evaluation;
        private final SimpleStringProperty medication;
        private final SimpleStringProperty treatments;
        private final SimpleStringProperty suffering_period;
        private final SimpleStringProperty current_status;

        public Book(String discomforts, String doctor, String evaluation, String medication, String treatments, String suffering_period, String current_status) {
            this.discomforts = new SimpleStringProperty(discomforts);
            this.doctor = new SimpleStringProperty(doctor);
            this.evaluation = new SimpleStringProperty(evaluation);
            this.medication = new SimpleStringProperty(medication);
            this.treatments = new SimpleStringProperty(treatments);
            this.suffering_period = new SimpleStringProperty(suffering_period);
            this.current_status = new SimpleStringProperty(current_status);
        }

        public String getDiscomforts() {
            return discomforts.get();
        }

        public String getDoctor() {
            return doctor.get();
        }
        
        public String getEvaluation() {
            return evaluation.get();
        }
        
        public String getMedication() {
            return medication.get();
        }
        
        public String getTreatments() {
            return treatments.get();
        }
        
        public String getSuffering_period() {
            return suffering_period.get();
        }
        
        public String getCurrent_status() {
            return current_status.get();
        }

    }
    
}
