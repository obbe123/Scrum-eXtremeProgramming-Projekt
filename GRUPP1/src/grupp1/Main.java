/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp1;

import GUI.LoginGUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sapporun
 */
public class Main {

    public static void main(String[] args) {
            Database.getDB();
            Login login1 = new Login();
            login1.setVisible(true);
            login1.setLocationRelativeTo(null);
    }

}
