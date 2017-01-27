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
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Sapporun
 */
public class Database {

    public int test8william;


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
    public static ResultSet sqlFraga (String fragan){
        try{
        Connection con = Database.getDB();
        Statement stmt = con.createStatement();            
        ResultSet rs = stmt.executeQuery(fragan);   
        return rs;
        }
        catch (Exception e){
            return null;
        }
        
    }
public static void laggTillBild(Person personen) {
       System.out.println(personen.getId());
        try {
            int personid = personen.getId();
            JFileChooser bildChooser = new JFileChooser();
            bildChooser.setDialogTitle("Välj bild");
            bildChooser.showOpenDialog(null);
            File valdBild=bildChooser.getSelectedFile();
            ResultSet bildDB = Database.sqlFraga("Select ID from bilder");
            int antalBilder = 1;
            while (bildDB.next()) {
            antalBilder++;
                    }
            String bildNamn = "Bild" + antalBilder;
            Connection con = Database.getDB();
            PreparedStatement ps = con.prepareStatement("insert into BILDER values(?,?,?,?)");
            ps.setInt(1, antalBilder);
            ps.setString(2, bildNamn);
            FileInputStream fin = new FileInputStream(valdBild.getAbsolutePath());
            ps.setBinaryStream(3, fin, fin.available());
            ps.setInt(4, personid);
            int i = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, i + " har blivit uppladdad!");
            con.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage() + "FEL!");
        }
        }
}
