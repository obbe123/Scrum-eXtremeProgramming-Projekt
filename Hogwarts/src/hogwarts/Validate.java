package hogwarts;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;




/**
 *
 * @author Henric Berg and Peter Karlsson
 */
public class Validate {
    
    /**
    * Detta är våran validerare. Dess syfte är att kontrollera saker som t.ex. tomma textfält, string-variabler som ev. kan vara null,
    * datumformat, och så vidare. Alla klasser är 'static' så vi inte behöver instansiera denna klass som ett objekt när den behövs.
    * Alla klasser som har någon typ av användarinmatning är beroende av den här klassen.
    * Alla metoder returnerar en boolean. Ex: textIsNotEmpty returnerar "true" om textrutan *inte* är tom. etc.
    */
    

    public static boolean textIsNotEmpty(JTextField textfield) {  //Kontrollerar om en textrutan är tom eller ej. Ger ett meddelande om rutan är tom.

        if (textfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt.");
            return false; 
        } else {
            return true;
        }
    }

    public static boolean textIsNotEmptyNoMsg(JTextField textfield) { //Kontrollerar om en textrutan är tom eller ej. Ger inget meddelande.

        if (textfield.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean labelIsNotEmpty(JLabel label) { //Kontrollerar om en etikett är tom eller ej. Med "tom" menas antingen null eller ett mellanslag i detta fall.

        if (label.getText().isEmpty() || label.getText().equals(" ")) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean pwdExisting(String pwd) { //Kontrollerar om ett lösenord (en string-variabel) redan finns angiven på en lärare i hogwarts-databasen,
        boolean pwdFound = false;                   // och ger ett meddelande om så är fallet. Används för att se till att flera lärare inte har samma lösenord.

        try {
            InfDB db = Database.getDB();
            ArrayList<String> pwdList = db.fetchColumn("select losenord from larare");

            int index = 0;

            if (!Validate.checkEmptyDBColumn(pwdList)) {

                while (index < pwdList.size() && !pwdFound) {

                    if (pwd.equals(pwdList.get(index))) {

                        pwdFound = true;
                        JOptionPane.showMessageDialog(null, "Detta lösenord är upptaget.");

                    }

                    index++;

                }
            }

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return pwdFound;
    }

    public static boolean pwdIsNotEmpty(JPasswordField pwdField) { //Kontrollerar om ett lösenordsfält är tomt eller ej. Ger ett meddelande om så är fallet.

        if (pwdField.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt.");
            return false;
        } else {
            return true;
        }

    }

    public static boolean listSelectedIsNotEmpty(JList list) { //Kontrollerar om ett "giltigt val" har angivits på en lista eller ej. Ogiltiga val är i detta fall null eller
                                                               // någon utav de 'standard'-meddelanden som används i programmet.
        try {

            if (list.getSelectedValue().toString().equals("")
                    || list.getSelectedValue().toString().equals("Inga elever funna")
                    || list.getSelectedValue().toString().equals("Välj ett elevhem")
                    || list.getSelectedValue().toString().equals("Inga betyg funna")
                    || list.getSelectedValue().toString().equals("Ingen kompetensnivå funnen")
                    || list.getSelectedValue().toString().equals("Välj ett ämne")
                    || list.getSelectedValue().toString().equals("Välj ett elevhem")
                    || list.getSelectedValue().toString().equals("Inga rum funna")
                    || list.getSelectedValue().toString().equals("Inga kurser funna")) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }

    }

    public static boolean cBoxIsNotEmpty(JComboBox cbox) { //Kontrollerar om om en combox är tom eller ej.

        try {
            String item = cbox.getSelectedItem().toString();

            if (item.equals("")) {

                return false;

            } else {

                return true;

            }

        } catch (Exception ex) {

            return false;

        }

    }

    public static boolean pwdMatching(String firstPwd, String secondPwd) { //Kontrollerar om två lösenord (två string-variabler) matchar. Ger meddelande om de inte gör det.

        if (firstPwd.equals(secondPwd)) {
            return true;

        } else {

            JOptionPane.showMessageDialog(null, "Lösenordsfälten matchar inte. Försök igen.");
            return false;
        }

    }

    public static boolean firstPageLogIn(JPasswordField pwdField, JCheckBox admin) { //Denna metod används specifikt för att kontrollera inloggningen som sker på
        boolean pwdFound = false;                                                    // programmets första sida. Den kollar så lösenorder finns, så fältet inte är tomt, 
                                                                                     // om lösenordet stämmer, om användaren har admin-status och ger meddelanden därefter.
        if (Validate.pwdIsNotEmpty(pwdField)) {                                      // Det är även denna metod som ber Start-klassen att visa lärar-gränssnittet.
            char[] pwdChar = pwdField.getPassword();
            String pwd = new String(pwdChar);

            try {
                InfDB db = Database.getDB();
                ArrayList<HashMap<String, String>> pwdList = db.fetchRows("select losenord, administrator from larare");

                if (Validate.checkEmptyDBRows(pwdList)) {
                    JOptionPane.showMessageDialog(null, "Inga registrerade lösenord funna.");
                } else {

                    int index = 0;

                    while (!pwdFound && index < pwdList.size()) {

                        if (!Validate.checkNullString(pwdList.get(index).get("LOSENORD")) && pwdList.get(index).get("LOSENORD").equals(pwd)) {

                            pwdFound = true;

                            if (Validate.checkNullString(pwdList.get(index).get("ADMINISTRATOR")) && admin.isSelected()) {

                                JOptionPane.showMessageDialog(null, "Det angivna lösenordet har inte administratörsrättigheter.");
                                pwdFound = false;
                                return pwdFound;

                            } else if (admin.isSelected() && pwdList.get(index).get("ADMINISTRATOR").equals("T")) {

                                Start.teacherActions(pwd, true);

                            } else if (admin.isSelected() && pwdList.get(index).get("ADMINISTRATOR").equals("F")) {

                                JOptionPane.showMessageDialog(null, "Det angivna lösenordet har inte administratörsrättigheter.");
                                pwdFound = false;
                                return pwdFound;

                            } else {
                                Start.teacherActions(pwd, false);
                            }
                        }
                        index++;
                    }

                    if (!pwdFound) {
                        JOptionPane.showMessageDialog(null, "Felaktigt lösenord.");

                    }

                }

            } catch (InfException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return pwdFound;
    }

    public static boolean checkIfInteger(String number) { //Kontrollerar om en string-variabel kan göras om till integer eller ej.

        try {
            Integer.parseInt(number);   
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public static boolean checkIfPositiveInteger(String number) { //Kontrollerar om en string kan göras om till integer, och kollar även om heltalsvärdet är större eller lika med noll.

        try {

            if (Integer.parseInt(number) >= 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            return false;
        }

    }

    public static boolean checkDateFormat(JTextField dateField) { //Kollar så att formatet på ett angivet datum stämmer, i detta fallet yyyy-mm-dd. Ger ett felmeddelande om det inte stämmer.
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;

        try {
            date = format.parse(dateField.getText());  //Om det inte gör att göra om textfältet till ett datumformat så innebär det att det är ett felaktigt format i detta fall.
            format.format(date);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Det är fel format på något av de angivna datumen. Försök med formatet: åååå-mm-dd");
            return false;
        }

    }

    public static boolean checkNullString(String string) { //Kollar om en string har värdet null eller ej. Om en string har värdet null returneras boolean true.
        if (string == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkEmptyDBRows(ArrayList<HashMap<String, String>> dbResult) { //Kontrollerar om en rad i databasen (en HashMap<String, String> är tom eller ej. 
                                                                                          // Om en rad inte är tom returneras boolean false.
        try {
            dbResult.size();   //Om programmet inte kan mäta storleken på Arraylistan så innebär det att den är tom, i detta fall.
            return false;
        } catch (Exception ex) {
            return true;
        }

    }

    public static boolean checkEmptyDBColumn(ArrayList<String> dbResult) { //Kontrollerar om en kolumn i databasen (ArrayList<String>) är tom eller ej. 
                                                                           //Om en kolumn inte är tom returneras boolean false.
        try {
            dbResult.size();  //Om programmet inte kan mäta storleken på Arraylistan så innebär det att den är tom, i detta fall.
            return false;
        } catch (Exception ex) {
            return true;
        }

    }

}
