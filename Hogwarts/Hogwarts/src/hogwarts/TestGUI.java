package hogwarts;
import javax.swing.JOptionPane;

/**
 *
 * @author Henric Berg and Peter Karlsson
 */
public class TestGUI extends javax.swing.JFrame {

    public TestGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConnectDB = new javax.swing.JButton();
        txtEmptyField = new javax.swing.JTextField();
        btnEmptyField = new javax.swing.JButton();
        lblSeparate = new javax.swing.JLabel();
        btnPath = new javax.swing.JButton();
        lblPath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConnectDB.setText("Testa DB-anslutning");
        btnConnectDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectDBActionPerformed(evt);
            }
        });

        btnEmptyField.setText("Testa om fältet är tomt");
        btnEmptyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyFieldActionPerformed(evt);
            }
        });

        lblSeparate.setText("|");

        btnPath.setText("Visa sökväg");
        btnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathActionPerformed(evt);
            }
        });

        lblPath.setText("Ingen sökväg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConnectDB)
                        .addGap(18, 18, 18)
                        .addComponent(lblSeparate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnEmptyField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmptyField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPath)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnectDB)
                    .addComponent(txtEmptyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmptyField)
                    .addComponent(lblSeparate))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPath)
                    .addComponent(lblPath))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectDBActionPerformed
        Database.getDB(); //denna knapp existerar bara som ett test för att se så DB-anslutningen funkar
    }//GEN-LAST:event_btnConnectDBActionPerformed

    private void btnEmptyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyFieldActionPerformed
        if (!Validate.textIsEmpty(txtEmptyField)){
            JOptionPane.showMessageDialog(null, "Textfältet är inte tomt.");
        }
    }//GEN-LAST:event_btnEmptyFieldActionPerformed

    private void btnPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathActionPerformed

    }//GEN-LAST:event_btnPathActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnectDB;
    private javax.swing.JButton btnEmptyField;
    private javax.swing.JButton btnPath;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lblSeparate;
    private javax.swing.JTextField txtEmptyField;
    // End of variables declaration//GEN-END:variables
}
