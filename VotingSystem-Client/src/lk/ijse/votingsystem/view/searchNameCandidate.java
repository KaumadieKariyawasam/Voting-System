/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.view;

/**
 *
 * @author HP
 */
public class searchNameCandidate extends javax.swing.JInternalFrame {

    /**
     * Creates new form SeemoreCandidate
     */
    public searchNameCandidate() {
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

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXTextField1 = new org.jdesktop.swingx.JXTextField();
        jXTextField2 = new org.jdesktop.swingx.JXTextField();
        jXTextField4 = new org.jdesktop.swingx.JXTextField();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXComboBox1 = new org.jdesktop.swingx.JXComboBox();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setEnabled(false);
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setText("Full Name");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 31));

        jXLabel2.setText("Candidate No.");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, 31));

        jXLabel3.setText("Post");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 70, 31));

        jXLabel4.setText("NIC No.");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 31));

        jXTextField1.setEnabled(false);
        jXPanel1.add(jXTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 140, 30));

        jXTextField2.setEnabled(false);
        jXTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXTextField2ActionPerformed(evt);
            }
        });
        jXPanel1.add(jXTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, 30));

        jXTextField4.setEnabled(false);
        jXPanel1.add(jXTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, 30));

        jXLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jXLabel5.setText("Candidate Picture");
        jXPanel1.add(jXLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 170, 200));

        jXLabel6.setText("detail,designation,service");
        jXPanel1.add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 860, 140));

        jXLabel9.setText("vision");
        jXPanel1.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 180, 140));

        jXLabel8.setText("Vission -:");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 90, 30));
        jXPanel1.add(jXComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 250, 30));

        jXButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/search.png"))); // NOI18N
        jXButton1.setText("Search");
        jXButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 130, 40));

        jXLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jXPanel1.add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1010, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton jXButton1;
    private org.jdesktop.swingx.JXComboBox jXComboBox1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTextField jXTextField1;
    private org.jdesktop.swingx.JXTextField jXTextField2;
    private org.jdesktop.swingx.JXTextField jXTextField4;
    // End of variables declaration//GEN-END:variables
}
