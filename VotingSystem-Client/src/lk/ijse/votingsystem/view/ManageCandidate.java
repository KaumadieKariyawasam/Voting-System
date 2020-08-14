/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.view;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lk.ijse.votingsystem.controller.CandidateController;
import lk.ijse.votingsystem.controller.CommissionController;
import lk.ijse.votingsystem.controller.VoterController;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.dto.CommissionDTO;
import lk.ijse.votingsystem.observer.Observerr;
import lk.ijse.votingsystem.validation.Validation;
import org.jdesktop.swingx.JXPanel;

/**
 *
 * @author HP
 */
public class ManageCandidate extends javax.swing.JInternalFrame {

    private static int x;
    private CandidateController candidateController;
    private Validation validation;
    private JPanel pnlJPanel;
    private String fileName;

    /**
     * Creates new form ManageCandidate
     */
//    public ManageCandidate() {
//        initComponents();
//        txtCid.setText("C"+(x+1));
//        candidateController=new CandidateController();
//        
//    }

    ManageCandidate(JXPanel pnlIntern) {
        initComponents();
        txtCid.setText("C" + (x + 1));
        candidateController = new CandidateController();
        pnlJPanel = pnlIntern;
        validation = new Validation();
//          try {
//            UnicastRemoteObject.exportObject(this, 0);
//           CandidateController.getSubject().registerObserver(this);
//           
//        } catch (Exception ex) {
//            Logger.getLogger(ManageCandidate.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        txtLastName = new org.jdesktop.swingx.JXTextField();
        txtNic = new org.jdesktop.swingx.JXTextField();
        txtEmail = new org.jdesktop.swingx.JXTextField();
        txtFirstName = new org.jdesktop.swingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new org.jdesktop.swingx.JXTextArea();
        btnBrows = new org.jdesktop.swingx.JXButton();
        lblPhoto = new org.jdesktop.swingx.JXLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFullName = new org.jdesktop.swingx.JXTextArea();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        txtTele = new org.jdesktop.swingx.JXTextField();
        txtCid = new org.jdesktop.swingx.JXTextField();
        txtIndexNo = new org.jdesktop.swingx.JXTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        btnUpdate = new javax.swing.JButton();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        btnDelete = new javax.swing.JButton();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        cmbPost = new javax.swing.JComboBox<>();
        txtPwrd = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        txtPhoto = new org.jdesktop.swingx.JXTextField();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel2.setText("Manage Candidate");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 470, 60));

        jXLabel3.setText("University Index No.");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 30));

        jXLabel4.setText("e-mail Address");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 110, 30));

        jXLabel5.setText("Last Name");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 30));

        jXLabel6.setText("First Name");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 30));

        jXLabel10.setText("Telephone No.");
        jXLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 130, 30));

        jXLabel11.setText("NIC No.");
        jXLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 130, 30));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jXPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 220, 30));
        jXPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 30));
        jXPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 230, 30));
        jXPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jXPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 100));

        btnBrows.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBrows.setText("Brows ...");
        btnBrows.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsActionPerformed(evt);
            }
        });
        jXPanel1.add(btnBrows, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 110, 40));

        lblPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXPanel1.add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 200, 210));

        txtFullName.setColumns(20);
        txtFullName.setRows(5);
        jScrollPane2.setViewportView(txtFullName);

        jXPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 220, 70));

        jXLabel12.setText("Upload Candidate Photograph");
        jXLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 280, 30));
        jXPanel1.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 160, 30));
        jXPanel1.add(txtCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, 30));
        jXPanel1.add(txtIndexNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 90, 30));

        jXLabel9.setText("Postal Address");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, 30));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/update.png"))); // NOI18N
        btnUpdate.setText("Change");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jXPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 180, 40));

        jXLabel15.setText("Post");
        jXLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 90, 30));

        jXLabel16.setText("Candidate No.");
        jXLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/delete.png"))); // NOI18N
        btnDelete.setText("Remove");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jXPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 180, 40));

        jXLabel17.setText("Password");
        jXLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 90, 30));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/view.png"))); // NOI18N
        btnView.setText("Show All");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jXPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 180, 40));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/search.png"))); // NOI18N
        btnSearch.setText("Find");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jXPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, 40));

        cmbPost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "President", "Secretary", "Commission Member" }));
        cmbPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPostActionPerformed(evt);
            }
        });
        jXPanel1.add(cmbPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 180, 30));
        jXPanel1.add(txtPwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 170, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/ManageCandidate.png"))); // NOI18N
        btnAdd.setText("Create New");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAdd.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                btnAddAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jXPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 180, 40));
        jXPanel1.add(txtPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, 30));

        jXLabel8.setText("Full Name");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 30));

        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1050, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
//        String indexNo=txtIndexNo.getText();
//        CommissionDTO cd=CommissionController.findCommissioner(indexNo);
//        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        CandidateDetail cd = new CandidateDetail(pnlJPanel);
        pnlJPanel.removeAll();
        pnlJPanel.add(cd);
        cd.setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {

            x++;

            String cId = txtCid.getText();
            String index = txtIndexNo.getText();
            String name = txtFullName.getText();
            String nic = txtNic.getText();
            String tpNo = txtTele.getText();
            String email = txtEmail.getText();
            String adress = txtAddress.getText();
            String password = txtPwrd.getText();
            String post = (String) cmbPost.getSelectedItem();
            File file = new File(txtPhoto.getText());
            String imageName = txtPhoto.getText();
            boolean correct = validation.nicValidation(nic);

            // String image=txtPhoto.getText();
            byte[] bImage = null;
            //byte[] bImage=new byte[(int)file.length()];
            System.out.println("" + (int) file.length());

            CandidateDTO candidateDTO = new CandidateDTO(cId, index, name, nic, tpNo, email, adress, password, post, bImage, fileName);
            if (correct) {
                boolean isAdded = candidateController.addCandidate(candidateDTO);
                System.out.println(isAdded + "");
                if (isAdded) {
                    x++;
                    int x = JOptionPane.showConfirmDialog(this, "Are you sure Added this candidate?");
                    if (x == 0) {
                        JOptionPane.showMessageDialog(this, "Candidate Added Successfully");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Can't added this candidate. Try again...");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Wrong Nic No. Please Insert Correct NIC");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageCandidate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void cmbPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPostActionPerformed

    private void btnAddAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnAddAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAncestorMoved

    private void btnBrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File f1 = fileChooser.getSelectedFile();
        fileName = f1.getAbsolutePath();
        txtPhoto.setText(fileName);
        System.out.println("fName" + fileName);
        ImageIcon image = new ImageIcon(fileName);
        Image im = image.getImage();
        Image myImg = im.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        lblPhoto.setIcon(newImage);


    }//GEN-LAST:event_btnBrowsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private org.jdesktop.swingx.JXButton btnBrows;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbPost;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXLabel lblPhoto;
    private org.jdesktop.swingx.JXTextArea txtAddress;
    private org.jdesktop.swingx.JXTextField txtCid;
    private org.jdesktop.swingx.JXTextField txtEmail;
    private org.jdesktop.swingx.JXTextField txtFirstName;
    private org.jdesktop.swingx.JXTextArea txtFullName;
    private org.jdesktop.swingx.JXTextField txtIndexNo;
    private org.jdesktop.swingx.JXTextField txtLastName;
    private org.jdesktop.swingx.JXTextField txtNic;
    private org.jdesktop.swingx.JXTextField txtPhoto;
    private javax.swing.JPasswordField txtPwrd;
    private org.jdesktop.swingx.JXTextField txtTele;
    // End of variables declaration//GEN-END:variables

}
