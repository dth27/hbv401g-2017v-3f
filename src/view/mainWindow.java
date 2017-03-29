/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import controller.taskManager;



/**
 *
 * @author Dottedsocks
 */
public class mainWindow extends javax.swing.JFrame {
    //mogulega otharfi, thar sem thetta er ekki birt strax? 
    Flight searchFlights;
    Booking BookedFlight;
    Passenger PassengerFlight;
    public int Adgerd;
    taskManager Joi;
    
    /**
     * Creates new form leitargluggi
     */
    public mainWindow() {
        initComponents();
        
        searchFlights = new Flight();
        BookedFlight = new Booking();
        PassengerFlight = new Passenger();
        Adgerd = 1;
        Joi = new taskManager();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLeitarPanel = new javax.swing.JPanel();
        jToWhere = new javax.swing.JComboBox<>();
        jFromWhere = new javax.swing.JComboBox<>();
        jFjoldi = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        jWhen = new javax.swing.JTextField();
        jResultPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLeitarPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLeitarPanelComponentHidden(evt);
            }
        });

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

        javax.swing.GroupLayout jLeitarPanelLayout = new javax.swing.GroupLayout(jLeitarPanel);
        jLeitarPanel.setLayout(jLeitarPanelLayout);
        jLeitarPanelLayout.setHorizontalGroup(
            jLeitarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLeitarPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jLeitarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLeitarPanelLayout.createSequentialGroup()
                        .addComponent(jWhen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToWhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFromWhere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLeitarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchButton)
                        .addComponent(jFjoldi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLeitarPanelLayout.setVerticalGroup(
            jLeitarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLeitarPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jLeitarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jResultPanelLayout = new javax.swing.GroupLayout(jResultPanel);
        jResultPanel.setLayout(jResultPanelLayout);
        jResultPanelLayout.setHorizontalGroup(
            jResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jResultPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jResultPanelLayout.setVerticalGroup(
            jResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResultPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLeitarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLeitarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try{
        jLeitarPanel.setVisible(false);
        Joi.synumNyjaSidu().setVisible(true);
        //System.out.println("JOI IS THE MAN!");
        }
        catch (Exception e) {
            System.out.println("Joi "+ e);
        }
        String hvadan = jFromWhere.getSelectedItem().toString();
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
        if (fjoldi > 0){
        //SsendumEfnid(fjoldi, hvar, hvert, hvenaer);
        Joi.buumTilLeit(hvadan, hvenaer, fjoldi, hvert);
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

    private void jLeitarPanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLeitarPanelComponentHidden
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLeitarPanelComponentHidden
    private void uppfaerautlit(){
        
                jLeitarPanel.setVisible(false);
                
                jResultPanel.setVisible(true);
         

    }
    //private void sendumEfnid(int fjoldi, String hvar, String hvert, String hvenaer){
        //birtumEfnid(nyLeit);
   // }
    //private void birtumEfnid( ...){
   //     efnid.toString();
        
        
    //}
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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jFjoldi;
    private javax.swing.JComboBox<String> jFromWhere;
    private javax.swing.JPanel jLeitarPanel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jResultPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jToWhere;
    private javax.swing.JTextField jWhen;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}