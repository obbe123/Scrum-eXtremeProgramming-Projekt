/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import grupp1.Person;

/**
 *
 * @author itslo
 */
public class ProfilGUI extends javax.swing.JFrame {
    
    private Person personen;

    /**
     * Creates new form ProfilGUI
     */
   public ProfilGUI(Person personen) {
        initComponents();
        this.personen = personen;
        
        String namn = personen.getFNamn() +" " + personen.getENamn();
        lblNamn.setText(namn);
        
        String organisation ="";
        lblVisaOrg.setText(organisation);
        
        String titel =""; 
        lblVisaTitel.setText(titel);
        
        String epost = personen.getEmail();
        lblVisaEpost.setText(epost);
        
        int telenr = personen.getTelefon();
        String tele = Integer.toString(telenr);
        lblVisaTel.setText("0"+tele);
        
        String rum = "";
        lblVisaRum.setText(rum);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBild = new javax.swing.JPanel();
        pBeskrivning = new javax.swing.JPanel();
        pInformation = new javax.swing.JPanel();
        lblOrganisation = new javax.swing.JLabel();
        lblTitel = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblRum = new javax.swing.JLabel();
        lblVisaOrg = new javax.swing.JLabel();
        lblVisaTel = new javax.swing.JLabel();
        lblVisaTitel = new javax.swing.JLabel();
        lblVisaEpost = new javax.swing.JLabel();
        lblVisaRum = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblOvrigInfo = new javax.swing.JLabel();
        btnRedigera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(525, 430));

        pBild.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pBildLayout = new javax.swing.GroupLayout(pBild);
        pBild.setLayout(pBildLayout);
        pBildLayout.setHorizontalGroup(
            pBildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        pBildLayout.setVerticalGroup(
            pBildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        pBeskrivning.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pBeskrivningLayout = new javax.swing.GroupLayout(pBeskrivning);
        pBeskrivning.setLayout(pBeskrivningLayout);
        pBeskrivningLayout.setHorizontalGroup(
            pBeskrivningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pBeskrivningLayout.setVerticalGroup(
            pBeskrivningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        pInformation.setBackground(new java.awt.Color(255, 255, 255));

        lblOrganisation.setText("Organisation:");

        lblTitel.setText("Titel:");

        lblTelefon.setText("Telefon:");

        lblEpost.setText("E-post:");

        lblRum.setText("Rum:");

        javax.swing.GroupLayout pInformationLayout = new javax.swing.GroupLayout(pInformation);
        pInformation.setLayout(pInformationLayout);
        pInformationLayout.setHorizontalGroup(
            pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformationLayout.createSequentialGroup()
                        .addComponent(lblOrganisation)
                        .addGap(18, 18, 18)
                        .addComponent(lblVisaOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pInformationLayout.createSequentialGroup()
                        .addComponent(lblTitel)
                        .addGap(77, 77, 77)
                        .addComponent(lblVisaTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGroup(pInformationLayout.createSequentialGroup()
                        .addComponent(lblRum)
                        .addGap(75, 75, 75)
                        .addComponent(lblVisaRum, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGroup(pInformationLayout.createSequentialGroup()
                        .addComponent(lblEpost)
                        .addGap(63, 63, 63)
                        .addComponent(lblVisaEpost, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGroup(pInformationLayout.createSequentialGroup()
                        .addComponent(lblTelefon)
                        .addGap(55, 55, 55)
                        .addComponent(lblVisaTel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pInformationLayout.setVerticalGroup(
            pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformationLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganisation)
                    .addComponent(lblVisaOrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitel)
                    .addComponent(lblVisaTitel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(lblVisaTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(lblVisaEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRum)
                    .addComponent(lblVisaRum))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblNamn.setText("Förnamn Efternamn");

        lblOvrigInfo.setText("Övrig information");

        btnRedigera.setText("Redigera profil");
        btnRedigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOvrigInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRedigera))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pBeskrivning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamn))))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pBild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOvrigInfo)
                .addGap(2, 2, 2)
                .addComponent(pBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRedigera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraActionPerformed
        // Till RegideraProfilGUI
        
        RedigeraProfilGUI rpGUI = new RedigeraProfilGUI(personen);
        rpGUI.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnRedigeraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedigera;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOrganisation;
    private javax.swing.JLabel lblOvrigInfo;
    private javax.swing.JLabel lblRum;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JLabel lblVisaEpost;
    private javax.swing.JLabel lblVisaOrg;
    private javax.swing.JLabel lblVisaRum;
    private javax.swing.JLabel lblVisaTel;
    private javax.swing.JLabel lblVisaTitel;
    private javax.swing.JPanel pBeskrivning;
    private javax.swing.JPanel pBild;
    private javax.swing.JPanel pInformation;
    // End of variables declaration//GEN-END:variables
}
