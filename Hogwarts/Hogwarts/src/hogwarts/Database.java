package hogwarts;

import java.io.File;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Henric Berg and Peter Karlsson
 */
public class Database {

    private static InfDB database;

    public static InfDB getDB() {
        String filePath = "";
        try {
            File currentDirectory = new File("");
            filePath = currentDirectory.getAbsolutePath() + "\\HOGDB.FDB";
            database = new InfDB(filePath);
            JOptionPane.showMessageDialog(null, "Anslutningen lyckades.");
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Följande sökväg användes: " + filePath);
            JOptionPane.showMessageDialog(null, "Anslutningen lyckades inte.");

        }
        return database; //Vad händer om 'catch' inträffar? Returneras null då??
    }

}
