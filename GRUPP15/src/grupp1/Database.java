/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sapporun
 */
public class Database {

    public static void getDB() {
        try {
            String host = "jdbc:derby://localhost:1527/gruppDB2";  //"jdbc:derby:gruppDB;create=true"  Detta skapar en embedded databas, behöver inte starta JavaDB
            String uName = "APP";                                          //gör dock en ny databas? weird... måste testas.
            String uPass = "masterkey";
            Connection con = DriverManager.getConnection(host, uName, uPass);
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }
}
