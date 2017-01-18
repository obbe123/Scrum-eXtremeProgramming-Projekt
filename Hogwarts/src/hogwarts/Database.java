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
/**
 * Denna klass är till för att ansluta till hogwartsdatabasen, och innehåller endast en enda metod.
 * Denna metod hämtar programmets sökväg (som alltid ska vara samma som databasen) och initialiserar en databas därifrån.
 * När detta är gjort så returneras databasobjektet.
 * Metoden är 'static' så man slipper att initialisera denna klass som ett objekt.
 */
    private static InfDB database;

    public static InfDB getDB() {
        String filePath = "";
        try {
            File currentDirectory = new File("");
            filePath = currentDirectory.getAbsolutePath() + "\\HOGDB.FDB";
            database = new InfDB(filePath);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Databasanslutningen lyckades inte. Se till så att databasen har samma sökväg som programmet.");
            

        }
        return database;
    }



}
