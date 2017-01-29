/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import grupp1.Database;
import grupp1.Person;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import java.util.Calendar;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

/**
 *
 * @author Nötfärs
 */
public class HemGUI extends javax.swing.JFrame {

    private Person inloggadPerson;

    public HemGUI(Person inloggadPerson) {
        this.inloggadPerson = inloggadPerson;
        initComponents();
        txtPnlInlagg1.setEditable(false);
        txtPnlInlagg2.setEditable(false);
        txtPnlInlagg3.setEditable(false);
        Calendar cal = Calendar.getInstance();
        lblDatum.setText("Visar: Startsida - Dagens datum är: " + cal.getTime().toString());
        uppdateraDatum();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlMeny = new javax.swing.JPanel();
        btnHem = new javax.swing.JButton();
        btnUtbildning = new javax.swing.JButton();
        btnForskning = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        lblDatum = new javax.swing.JLabel();
        pnlMeny2 = new javax.swing.JPanel();
        btnStartsida = new javax.swing.JButton();
        btnSkapaInlagg = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlTextArea = new javax.swing.JPanel();
        scrPnlTextPane1 = new javax.swing.JScrollPane();
        txtPnlInlagg1 = new javax.swing.JTextPane();
        scrPnlTextPane2 = new javax.swing.JScrollPane();
        txtPnlInlagg2 = new javax.swing.JTextPane();
        scrPnlTextPane3 = new javax.swing.JScrollPane();
        txtPnlInlagg3 = new javax.swing.JTextPane();
        lblRubrik1 = new javax.swing.JLabel();
        lblRubrik2 = new javax.swing.JLabel();
        lblRubrik3 = new javax.swing.JLabel();
        lblForfattare1 = new javax.swing.JLabel();
        lblDatum2 = new javax.swing.JLabel();
        lblDatum3 = new javax.swing.JLabel();
        lblDatum1 = new javax.swing.JLabel();
        lblForfattare2 = new javax.swing.JLabel();
        lblForfattare3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        btnHem.setBackground(new java.awt.Color(255, 255, 255));
        btnHem.setText("Hem");

        btnUtbildning.setBackground(new java.awt.Color(255, 255, 255));
        btnUtbildning.setText("Utbildning");

        btnForskning.setBackground(new java.awt.Color(255, 255, 255));
        btnForskning.setText("Forskning");
        btnForskning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForskningActionPerformed(evt);
            }
        });

        btnProfil.setBackground(new java.awt.Color(255, 255, 255));
        btnProfil.setText("Profil");
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenyLayout = new javax.swing.GroupLayout(pnlMeny);
        pnlMeny.setLayout(pnlMenyLayout);
        pnlMenyLayout.setHorizontalGroup(
            pnlMenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUtbildning, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlMenyLayout.setVerticalGroup(
            pnlMenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfil)
                    .addComponent(btnForskning)
                    .addComponent(btnUtbildning)
                    .addComponent(btnHem)
                    .addComponent(lblDatum))
                .addContainerGap())
        );

        btnStartsida.setBackground(new java.awt.Color(255, 255, 255));
        btnStartsida.setText("Startsida");
        btnStartsida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartsidaActionPerformed(evt);
            }
        });

        btnSkapaInlagg.setBackground(new java.awt.Color(255, 255, 255));
        btnSkapaInlagg.setText("Skapa inlägg");
        btnSkapaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaInlaggActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Logga ut");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMeny2Layout = new javax.swing.GroupLayout(pnlMeny2);
        pnlMeny2.setLayout(pnlMeny2Layout);
        pnlMeny2Layout.setHorizontalGroup(
            pnlMeny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeny2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSkapaInlagg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(btnStartsida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMeny2Layout.setVerticalGroup(
            pnlMeny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeny2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStartsida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSkapaInlagg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        scrPnlTextPane1.setViewportView(txtPnlInlagg1);

        scrPnlTextPane2.setViewportView(txtPnlInlagg2);

        scrPnlTextPane3.setViewportView(txtPnlInlagg3);

        lblRubrik1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRubrik1.setText("Inlägg 1 rubrik här här här här här");

        lblRubrik2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRubrik2.setText("Inlägg 3 rubrik här här här här här");

        lblRubrik3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRubrik3.setText("Inlägg 2 rubrik här här här här här");

        lblForfattare1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblForfattare1.setText("Inlägg 1 författare här här här här");

        lblDatum2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDatum2.setText("Inlägg 2 datum här här här här här");

        lblDatum3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDatum3.setText("Inlägg 3 datum här här här här här");

        lblDatum1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDatum1.setText("Inlägg 1 datum här här här här här");

        lblForfattare2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblForfattare2.setText("Inlägg 2 författare här här här här");

        lblForfattare3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblForfattare3.setText("Inlägg 3 författare här här här här");

        javax.swing.GroupLayout pnlTextAreaLayout = new javax.swing.GroupLayout(pnlTextArea);
        pnlTextArea.setLayout(pnlTextAreaLayout);
        pnlTextAreaLayout.setHorizontalGroup(
            pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextAreaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRubrik1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrik2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrik3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForfattare1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatum3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForfattare2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForfattare3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPnlTextPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrPnlTextPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrPnlTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        pnlTextAreaLayout.setVerticalGroup(
            pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPnlTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTextAreaLayout.createSequentialGroup()
                        .addComponent(lblRubrik1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblForfattare1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPnlTextPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTextAreaLayout.createSequentialGroup()
                        .addComponent(lblRubrik3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblForfattare2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTextAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPnlTextPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTextAreaLayout.createSequentialGroup()
                        .addComponent(lblRubrik2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatum3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblForfattare3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlMeny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnlMeny2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMeny2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed

        ProfilGUI pGUI = new ProfilGUI(inloggadPerson);
        pGUI.setVisible(true);
        
//        try {
//            Connection con = Database.getDB();
//            Statement stmt = con.createStatement();
//            String sql = "SELECT * FROM namn";
//            ResultSet rs = stmt.executeQuery(sql);
//            String p = "";
//            
//            while (rs.next()) {
//                p = p + "ID: " + rs.getInt("ID") + " - Namn: " + rs.getString("fornamn") + " " + rs.getString("efternamn") + "\n";
//                jTextArea1.setText(p);
//            }
//        } catch (SQLException error) {
//            System.out.println(error.getMessage());
//        }
    }//GEN-LAST:event_btnProfilActionPerformed

    private void btnStartsidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartsidaActionPerformed
        txtPnlInlagg1.setText("Du är inloggad som " + inloggadPerson.getFNamn() + " " 
        + inloggadPerson.getENamn() + "\nDitt telefonnummer är: " + inloggadPerson.getTelefon()
        + "\nDin epost är: " + inloggadPerson.getEmail()
        + "\nDin titel är: " + inloggadPerson.getTitel());
        
        txtPnlInlagg2.setText("Du är inloggad som " + inloggadPerson.getFNamn() + " " 
        + inloggadPerson.getENamn() + "\nDitt telefonnr: " + inloggadPerson.getTelefon()
        + "\nDin epost är: " + inloggadPerson.getEmail()
        + "\nDin titel är: " + inloggadPerson.getTitel());
        
        txtPnlInlagg3.setText("Du är inloggad som " + inloggadPerson.getFNamn() + " " 
        + inloggadPerson.getENamn() + "\nDitt telefonnr: " + inloggadPerson.getTelefon()
        + "\nDin epost är: " + inloggadPerson.getEmail()
        + "\nDin titel är: " + inloggadPerson.getTitel());
    }//GEN-LAST:event_btnStartsidaActionPerformed

    private void btnSkapaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaInlaggActionPerformed
        InlaggGUI inlagg = new InlaggGUI(inloggadPerson);
        inlagg.setVisible(true);
    }//GEN-LAST:event_btnSkapaInlaggActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
            LoginGUI login1 = new LoginGUI();
            login1.setVisible(true);
            login1.setLocationRelativeTo(null);
            dispose();
        try {
        File currentDirectory = new File("");
        String mp3 = currentDirectory.getAbsolutePath() + "\\login.wav"; 
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(mp3));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnForskningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForskningActionPerformed

    }//GEN-LAST:event_btnForskningActionPerformed
    public void uppdateraDatum() {
          ActionListener uppgift = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Calendar cal = Calendar.getInstance();
        lblDatum.setText("Visar: Startsida - Dagens datum är: " + cal.getTime().toString());

      }
  };   
          new Timer(1000, uppgift).start();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForskning;
    private javax.swing.JButton btnHem;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnSkapaInlagg;
    private javax.swing.JButton btnStartsida;
    private javax.swing.JButton btnUtbildning;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDatum1;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JLabel lblDatum3;
    private javax.swing.JLabel lblForfattare1;
    private javax.swing.JLabel lblForfattare2;
    private javax.swing.JLabel lblForfattare3;
    private javax.swing.JLabel lblRubrik1;
    private javax.swing.JLabel lblRubrik2;
    private javax.swing.JLabel lblRubrik3;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMeny;
    private javax.swing.JPanel pnlMeny2;
    private javax.swing.JPanel pnlTextArea;
    private javax.swing.JScrollPane scrPnlTextPane1;
    private javax.swing.JScrollPane scrPnlTextPane2;
    private javax.swing.JScrollPane scrPnlTextPane3;
    private javax.swing.JTextPane txtPnlInlagg1;
    private javax.swing.JTextPane txtPnlInlagg2;
    private javax.swing.JTextPane txtPnlInlagg3;
    // End of variables declaration//GEN-END:variables
}
