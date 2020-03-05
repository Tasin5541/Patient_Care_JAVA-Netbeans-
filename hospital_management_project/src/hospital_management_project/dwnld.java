/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_project;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 *
 * @author User
 */
public class dwnld extends Thread{
    @Override
        public void run(){
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(RegistrationController.class.getName()).log(Level.SEVERE, null, ex);
            }
             Notifications notificationbuilder = Notifications.create()
               .title(variable.title)
               .text(variable.text)
               .graphic(null)
               .hideAfter(Duration.seconds(3))
               .position(Pos.TOP_LEFT);
        notificationbuilder.darkStyle();
   
        
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    notificationbuilder.showConfirm();
                }
            });       
        }
}
