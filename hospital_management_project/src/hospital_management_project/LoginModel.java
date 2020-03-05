/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LoginModel {

    Connection connection;
    // Connection conn = null;
    Statement stmt = null;

    public LoginModel() {
        connection = SqliteConnection.Connector();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "problem of modular class");
            System.exit(1);

        }
    }

    public boolean isDBConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLogin(String user, String pass) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = "select * from login where name=? and password=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            //Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
    }

    public boolean isSignup(String user, String pass, String date, String gender, String email, String contact, String blood, String pic) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String query = "insert into  login values  (?,?,?,?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);
            preparedStatement.setString(3, date);
            preparedStatement.setString(4, gender);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, contact);
            preparedStatement.setString(7, blood);
            preparedStatement.setString(8, pic);
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean isBook(String name,String col) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String query = "insert into  doctor("+col+") values  (?)";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ResultSet execQuery(String query) {

        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            stmt = connection.prepareStatement(query);
            result = stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return null;
        } finally {
        }
        return result;
    }
}
