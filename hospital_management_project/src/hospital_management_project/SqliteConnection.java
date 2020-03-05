/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SqliteConnection {
    public static Connection Connector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection con =(Connection) DriverManager.getConnection("jdbc:sqlite:javafx.sqlite");
			//JOptionPane.showMessageDialog(null, "Connected");
			return con;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
}
