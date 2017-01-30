/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp1;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sapporun
 */
public class Database {

    public static Connection getDB() {
        String filePath = "";
        try {
            File currentDirectory = new File("");
            filePath = currentDirectory.getAbsolutePath() + "\\GruppDB2";       //Detta skapar en embedded databas, behöver inte starta JavaDB manuellt
            String host = "jdbc:derby:" + filePath;                             //För att visa DB tables - Services > Drivers > Högerklicka JavaDB(Embedded) > Connect Using...
            String uName = "APP";                                               //Database: C:\...\gruppDB2
            String uPass = "masterkey";                                         //User Name: APP
            Connection con = DriverManager.getConnection(host, uName, uPass);   //Password: masterkey
            return con;
        } catch (SQLException error) {
            System.out.println(error.getMessage());
            return null;
        }
    }

    public static ResultSet sqlSelect(String fragan) {
        try {
            Connection con = Database.getDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fragan);
            return rs;
        } catch (Exception e) {
            return null;
        }

    }

    public static void sqlInsert(String fragan) {
        try {
            Connection con = Database.getDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(fragan);
        } catch (Exception e) {
        }

    }

    public static boolean laggTillBild(Person personen) {
        boolean koll = false;
        try {

            ResultSet idKollTom = Database.sqlSelect("select PERSONID from bilder join ANVANDARE on PERSONID = ANVANDARE.ANVANDARID WHERE ANVANDARID = " + personen.getId());
            if (idKollTom.next()) {
                try {
                    JFileChooser bildChooser = new JFileChooser();
                    bildChooser.setDialogTitle("Välj bild");
                    bildChooser.showOpenDialog(null);
                    File valdBild = bildChooser.getSelectedFile();
                    Connection con = Database.getDB();
                    PreparedStatement ps = con.prepareStatement("update BILDER set FOTO = (?) where PERSONID = " + personen.getId());
                    FileInputStream fin = new FileInputStream(valdBild.getAbsolutePath());
                    ps.setBinaryStream(1, fin, fin.available());
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Din bild har blivit uppdaterad!");
                    con.close();
                    koll = true; 
                } catch (Exception e) {
                }
            } else {
                try {
                    ResultSet bildDB = Database.sqlSelect("Select ID from bilder");
                    int personid = personen.getId();
                    JFileChooser bildChooser = new JFileChooser();
                    bildChooser.setDialogTitle("Välj bild");
                    bildChooser.showOpenDialog(null);
                    File valdBild = bildChooser.getSelectedFile();
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
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "En bild har blivit uppladdad!");
                    con.close();
                    koll = true;
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Oj, det blev visst lite fel! Försök igen.");
        }
                            return koll;
    }
    public static void uppdateraBild(JLabel enFuling, Person personen) {
                ResultSet rs = Database.sqlSelect("select FOTO from bilder where personid = " + personen.getId());
        try {
            if (rs.next()) {
                byte[] img = rs.getBytes("FOTO");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(enFuling.getWidth(), enFuling.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                enFuling.setIcon(newImage);
            }
        } catch (Exception error) {

        }
    }
        public static void uppdateraLosenord(String losenord, Person inloggadPerson) {
        try {
                    Connection con = Database.getDB();
                    String fragan = ("update anvandare set loseonord = '" + losenord + "' where anvandarid = " + inloggadPerson.getId());
                    sqlInsert(fragan);
                    JOptionPane.showMessageDialog(null, "Ditt lösenord har blivit uppdaterat till: " + losenord);
                    con.close();
            }
             catch (Exception error) {

        }
    }
public static void uppdateraTelefon(String telefon, Person inloggadPerson) {
        try {
                    Connection con = Database.getDB();
                    String fragan = ("update anvandare set telefon = '" + telefon + "' where anvandarid = " + inloggadPerson.getId());
                    sqlInsert(fragan);
                    JOptionPane.showMessageDialog(null, "Ditt telefonnummer har blivit uppdaterat till:" + telefon);
                    con.close();
            }
             catch (Exception error) {

        }
    }
public static void uppdateraEpost(String epost, Person inloggadPerson) {
        try {
                    Connection con = Database.getDB();
                    String fragan = ("update anvandare set anvandar_epost = '" + epost + "' where anvandarid = " + inloggadPerson.getId());
                    sqlInsert(fragan);
                    JOptionPane.showMessageDialog(null, "Din epost har blivit uppdaterad till: " + epost);
                    con.close();
            }
             catch (Exception error) {

        }
    }
public static void uppdateraRum(String rum, Person inloggadPerson) {
        try {
                    Connection con = Database.getDB();
                    String fragan = ("update anvandare set kontors_rum = '" + rum + "' where anvandarid = " + inloggadPerson.getId());
                    sqlInsert(fragan);
                    JOptionPane.showMessageDialog(null, "Din epost har blivit uppdaterad till: " + rum);
                    con.close();
            }
             catch (Exception error) {

        }
    }

}
