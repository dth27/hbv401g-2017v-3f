/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidmot;
import vinnsla.Booking;
import vinnsla.*;

/**
 *
 * @author Dottedsocks
 */
public class Aðalgluggi extends javax.swing.JFrame {
    
    
    /**
     * Creates new form leitargluggi
     */
    public Aðalgluggi() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToWhere = new javax.swing.JComboBox<>();
        jFromWhere = new javax.swing.JComboBox<>();
        jFjoldi = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        jWhen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToWhere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose destination", "Akureyri", "Reykjavík", "Egilstaðir", "Ísafjörður", "Höfn í Hornafirði", " " }));
        jToWhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToWhereActionPerformed(evt);
            }
        });

        jFromWhere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veldu brotfarastað", "Akureyri", "Reykjavík", "Egilsstaðir", "Hólmavík", "Höfn í Hornafirði", "Ísafjörður" }));
        jFromWhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFromWhereActionPerformed(evt);
            }
        });

        jFjoldi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fjöldi", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jWhen.setText("dd/mm/yyyy");
        jWhen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWhenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jWhen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToWhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFromWhere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchButton)
                        .addComponent(jFjoldi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToWhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWhen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFromWhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFjoldi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String hvar = jFromWhere.getSelectedItem().toString();
        String hvert = jToWhere.getSelectedItem().toString();
        String hvenaer =jWhen.getText();
        //passa ad tjekka a gildum 
        //Tharf kannski ekki ad tjekka a strengjunum?
        //Haegt ad lata SQL sja um thad? En vid viljum hafa flokk af loglegum breytum...
        int fjoldi;
        try{
        fjoldi = Integer.valueOf(jFjoldi.getSelectedItem().toString());
        
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());  
            fjoldi = 0;
        }
        if (fjoldi < 0){
        sendumEfnid(fjoldi, hvar, hvert, hvenaer);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jFromWhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFromWhereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFromWhereActionPerformed

    private void jToWhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToWhereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToWhereActionPerformed

    private void jWhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWhenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jWhenActionPerformed

    private void sendumEfnid(int fjoldi, String hvar, String hvert, String hvenaer){
        //birtumEfnid(nyLeit);
    }
    private void birtumEfnid(SearchManager efnid){
        efnid.toString();
        
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Aðalgluggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aðalgluggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aðalgluggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aðalgluggi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aðalgluggi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jFjoldi;
    private javax.swing.JComboBox<String> jFromWhere;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jToWhere;
    private javax.swing.JTextField jWhen;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
