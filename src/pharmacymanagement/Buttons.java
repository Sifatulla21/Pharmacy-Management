/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacymanagement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Buttons extends javax.swing.JFrame {

    /**
     * Creates new form Buttons
     */
    public Buttons() {
        /**
         * This is constructor
         */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void login(){
            /**
             * This method is for login button.
             * After click this button login page will open
             */
             Login l = new Login();
             l.setVisible(true);
             this.setVisible(false);
        }
        public void registration(){
            /**
             * This method is for registration button.
             * After click this button registration page will open
             */
             Registration r = new Registration();
             r.setVisible(true);
             this.setVisible(false);
        }
        public void dashBoardButtontn(){
            /**
             * This method is for dashboard button.
             * After click this button dashboard page will open
             */
                    Dashboard db = new Dashboard();
                    db.setVisible(true);
                    this.setVisible(false);
    }
    public void checkExpDateButton(){
             /**
             * This method is for expiry date check button.
             * After click this button expiry date page will open
             */
                     ExpDate exp = new ExpDate();
        try {
            exp.validateDate();
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        exp.setVisible(true);
        this.setVisible(false);
    }
    public void manageMedicineButton(){
             /**
             * This method is for manage medicine button.
             * After click this button manage medicine page will open
             */
        ManageMedicine mm = new ManageMedicine();
        mm.loadData();
        mm.setVisible(true);
        this.setVisible(false);
    }
    public void manageAgentButton(){
             /**
             * This method is for manage agent button.
             * After click this button manage agent page will open
             */
        ManageAgent ma = new ManageAgent();
        ma.loadData();
        ma.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buttons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
