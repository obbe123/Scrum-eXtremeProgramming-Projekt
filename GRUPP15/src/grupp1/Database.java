/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.File;

/**
 *
 * @author Sapporun
 */
public class Database {
    public int test2;

    public static Connection getDB() {
        String filePath = "";
        try {
            File currentDirectory = new File("");
            filePath = currentDirectory.getAbsolutePath() + "\\GruppDB2";
            String host = "jdbc:derby://localhost:1527/" + filePath;         //"jdbc:derby:gruppDB;create=true"  Detta skapar en embedded databas, behöver inte starta JavaDB
            String uName = "APP";                                           //gör dock en ny databas? weird... måste testas.
            String uPass = "masterkey";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            return con;
        } catch (SQLException error) {
            System.out.println(error.getMessage());
            return null;
        }
    }
}
