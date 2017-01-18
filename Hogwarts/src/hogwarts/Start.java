package hogwarts;

/**
 *
 * @author Henric Berg and Peter Karlsson
 */
public class Start {
/**
 * Denna klass innehåller den main-metod som öppnar programmets förstasida när programmet startas.
 * Den innehåller även metoder som initialiserar de klasser som representerar det grafiska gränssnittet.
 *  
 */
    
    
    public static void main(String[] args) { //Main metod. Anropar 'welcome'-metoden som initialiserar startsidans gränssnitt.
        welcome();

    }

    public static void welcome() { //Startsida
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
    }
    
    public static void studentActions() { //Elevernas gränssnitt.
        StudentActions studentActions = new StudentActions();
        studentActions.setVisible(true);
    }
    
    
    public static void teacherActions(String pwd, boolean admin) { //Lärar-gränssnitt. Tar emot (och skickar vidare) lärarens lösenord (string) och adminstatus (true/false)
        TeacherActions teacherActions = new TeacherActions(pwd, admin);
        teacherActions.setVisible(true);
    }
    
    public static void adminActions(String pwd) { //Admin-gränssnitt. Tar emot (och skickar vidare) lösenord (string).
        AdminActions adminActions = new AdminActions(pwd);
        adminActions.setVisible(true);
    }

        

}
