/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.apache.commons.logging.Log;

/**
 *
 * @author HP
 */
public class SplashScreen extends javax.swing.JFrame {

    private Timer tmrAnimation;

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        setLocationRelativeTo(null);

        tmrAnimation = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pgrLoading.setValue(pgrLoading.getValue() + 10);
                if (pgrLoading.getValue() >= pgrLoading.getMaximum()) {
                    tmrAnimation.stop();
                    SplashScreen.this.dispose();
                    NewLog log=new NewLog();
                    log.setVisible(true);
//                    LogIn log = new LogIn();
//                    log.setVisible(true);

                }
            }
        });
        tmrAnimation.start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jLabel1 = new javax.swing.JLabel();
        pgrLoading = new javax.swing.JProgressBar();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        txtSplash = new org.jdesktop.swingx.JXLabel();
        jLabel2 = new javax.swing.JLabel();

        setUndecorated(true);

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Loading ...");
        jXPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 120, 30));

        pgrLoading.setForeground(new java.awt.Color(255, 0, 51));
        pgrLoading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pgrLoading.setOpaque(true);
        jXPanel1.add(pgrLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 290, 20));

        jXLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jXLabel3.setText("for Select Union Members");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 250, 30));

        jXLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jXLabel2.setText("UCSC Voting System");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 260, 30));

        txtSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/splash1.png"))); // NOI18N
        jXPanel1.add(txtSplash, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 290));

        jLabel2.setText("Copy Right 2018, All Right Reserved");
        jXPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JProgressBar pgrLoading;
    private org.jdesktop.swingx.JXLabel txtSplash;
    // End of variables declaration//GEN-END:variables
}
