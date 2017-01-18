package hogwarts;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Henric Berg and Peter Karlsson
 */

public class Validate {

   public static boolean textIsEmpty(JTextField tf) {

        if (tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt.");
            tf.requestFocus(); // Sätter fokus vid fel
            return true;
        } else {
            return false;
        }
    }

}
