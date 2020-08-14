/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.view;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import lk.ijse.votingsystem.controller.VoterController;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.observer.Observerr;
import org.jdesktop.swingx.JXPanel;

/**
 *
 * @author HP
 */
public class ManageVoters extends javax.swing.JInternalFrame implements Observerr {

    /**
     * Creates new form ManageVoters
     */
    private static JPanel internalFrame;

    ManageVoters(JXPanel pnlIntern) {

        initComponents();

        internalFrame = pnlIntern;
        try {
            UnicastRemoteObject.exportObject(this, 0);
            VoterController.getSubject().registerObserver(this);

        } catch (Exception ex) {
            Logger.getLogger(ManageVoters.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        txtContact = new org.jdesktop.swingx.JXTextField();
        txtName = new org.jdesktop.swingx.JXTextField();
        txtAdd = new org.jdesktop.swingx.JXTextField();
        txtNic = new org.jdesktop.swingx.JXTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        txtIndexNo = new org.jdesktop.swingx.JXTextField();
        btnUpdate = new org.jdesktop.swingx.JXButton();
        btnAdd = new org.jdesktop.swingx.JXButton();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        btnDelete = new org.jdesktop.swingx.JXButton();
        txtPassword = new javax.swing.JPasswordField();
        btnView = new org.jdesktop.swingx.JXButton();
        btnSearch = new org.jdesktop.swingx.JXButton();
        btnSearch1 = new org.jdesktop.swingx.JXButton();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel2.setText("Manage Voter");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 380, 60));

        jXLabel3.setText("NIC Number");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 30));

        jXLabel4.setText("Contact Number");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 110, 30));

        jXLabel6.setText("Password");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 100, 30));

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jXPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 180, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jXPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 280, 30));

        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        jXPanel1.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 320, 80));

        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });
        jXPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 180, 30));

        jXLabel9.setText("Index Number");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, 30));

        txtIndexNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndexNoActionPerformed(evt);
            }
        });
        jXPanel1.add(txtIndexNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 180, 30));

        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jXPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 140, 40));

        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/add.png"))); // NOI18N
        btnAdd.setText("Create New");
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jXPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 180, 40));

        jXLabel8.setText("Postal Address");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 30));

        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jXPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 140, 40));
        jXPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 170, 30));

        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/view.png"))); // NOI18N
        btnView.setText("Show All ");
        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jXPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 140, 40));

        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/Refresh (2).png"))); // NOI18N
        btnSearch.setText("Refresh");
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jXPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 40));

        btnSearch1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/search.png"))); // NOI18N
        btnSearch1.setText("Find");
        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });
        jXPanel1.add(btnSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 140, 40));

        jXLabel7.setText("Name with Initials");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 110, 30));

        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 32, 1000, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicActionPerformed

    private void txtIndexNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndexNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndexNoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String index = txtIndexNo.getText();
            VoterDTO voterDTO = new VoterDTO(txtIndexNo.getText(), txtName.getText(), txtNic.getText(), txtContact.getText(), txtAdd.getText(), txtPassword.getText());
            boolean updated = VoterController.updateVoter(voterDTO);
            if (updated) {
                JOptionPane.showMessageDialog(this, "Updated...");
            } else {
                JOptionPane.showMessageDialog(this, "Update Failled");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageVoters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String index = txtIndexNo.getText();
            String name = txtName.getText();
            String nic = txtNic.getText();
            String contact = txtContact.getText();
            String address = txtAdd.getText();
            String password = txtPassword.getText();
            VoterDTO voterDTO = new VoterDTO(index, name, nic, contact, address, password);
            boolean isAdd = VoterController.addVoters(voterDTO);
            if (isAdd) {
                JOptionPane.showMessageDialog(this, "Voter Added Sucessfully");

            } else {
                JOptionPane.showMessageDialog(this, "Voter Added Failled");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageVoters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        txtIndexNo.setText("");
        txtName.setText("");
        txtNic.setText("");
        txtContact.setText("");
        txtAdd.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ViewVoter v = new ViewVoter(internalFrame);
        internalFrame.removeAll();
        internalFrame.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        try {
            String index = txtIndexNo.getText();
            VoterDTO voterDTO = VoterController.searchVoter(index);
            txtName.setText(voterDTO.getName());
            txtNic.setText(voterDTO.getTpNo());
            txtContact.setText(voterDTO.getContact());
            txtAdd.setText(voterDTO.getAddress());
            txtPassword.setText(voterDTO.getPassword());
        } catch (Exception ex) {
            Logger.getLogger(ManageVoters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            boolean deleted = VoterController.deleteVoter(txtIndexNo.getText());
            if (deleted) {
                JOptionPane.showMessageDialog(this, "Deleted...");
            } else {
                JOptionPane.showMessageDialog(this, "Deleted..");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageVoters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAdd;
    private org.jdesktop.swingx.JXButton btnDelete;
    private org.jdesktop.swingx.JXButton btnSearch;
    private org.jdesktop.swingx.JXButton btnSearch1;
    private org.jdesktop.swingx.JXButton btnUpdate;
    private org.jdesktop.swingx.JXButton btnView;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTextField txtAdd;
    private org.jdesktop.swingx.JXTextField txtContact;
    private org.jdesktop.swingx.JXTextField txtIndexNo;
    private org.jdesktop.swingx.JXTextField txtName;
    private org.jdesktop.swingx.JXTextField txtNic;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

//     public void loadVoters() {
//        try {
//            DefaultTableModel dtm=(DefaultTableModel) tblVoters.getModel();
//            List<VoterDTO> allVoter=VoterController.getAllVoter();
//            
//            if(allVoter==null){
//                return;
//            }
//            for (VoterDTO voterDTO : allVoter) {
//                Object[] rowData={voterDTO.getIndexNo(),voterDTO.getName(),voterDTO.getTpNo(),voterDTO.getContact(),voterDTO.getAddress()};
//                dtm.addRow(rowData);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ViewVoter.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    @Override
    public void updateObservers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}