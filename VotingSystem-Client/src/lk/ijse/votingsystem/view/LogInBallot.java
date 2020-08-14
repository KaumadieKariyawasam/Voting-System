/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.votingsystem.controller.CandidateController;
import lk.ijse.votingsystem.controller.VoteController;
import lk.ijse.votingsystem.controller.VoterController;
import lk.ijse.votingsystem.dto.CandidateDTO;
import lk.ijse.votingsystem.dto.VoteDTO;
import lk.ijse.votingsystem.dto.VoterDTO;
import lk.ijse.votingsystem.dto.VotesDTO;

/**
 *
 * @author HP
 */
public class LogInBallot extends javax.swing.JFrame {

    /**
     * Creates new form LogInBallot
     */
    private String pNmae;
    private String sName;
    private String cName;
    private DefaultTableModel dtm;

    public LogInBallot() {
        initComponents();
        dtm = (DefaultTableModel) tblBallot.getModel();
        setLocationRelativeTo(null);
        loadData();
        pnlVote.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPnl = new org.jdesktop.swingx.JXPanel();
        pnlBlt = new javax.swing.JPanel();
        pnlLog = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIndex = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPwrd = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlVote = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbSecretart = new javax.swing.JComboBox<>();
        cmbPresident = new javax.swing.JComboBox<>();
        cmbUnionMember = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBallot = new org.jdesktop.swingx.JXTable();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        lblId = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPnl.setBackground(new java.awt.Color(255, 255, 255));
        pnlPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBlt.setBackground(new java.awt.Color(255, 255, 255));
        pnlBlt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLog.setBackground(new java.awt.Color(255, 255, 255));
        pnlLog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Campus Index No.");
        pnlLog.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, 30));
        pnlLog.add(txtIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlLog.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, 30));
        pnlLog.add(txtPwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Password");
        pnlLog.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Password");
        pnlLog.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, 30));

        pnlBlt.add(pnlLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 480, 140));

        pnlVote.setBackground(new java.awt.Color(255, 255, 255));
        pnlVote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Set Your Vote from Candidate ID");
        pnlVote.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 310, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Vote for Union Member ");
        pnlVote.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 190, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Vote for Secrestary ");
        pnlVote.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 160, 29));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Vote for President ");
        pnlVote.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 29));

        cmbSecretart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSecretartItemStateChanged(evt);
            }
        });
        cmbSecretart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbSecretartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbSecretartMouseReleased(evt);
            }
        });
        cmbSecretart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSecretartActionPerformed(evt);
            }
        });
        pnlVote.add(cmbSecretart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));

        cmbPresident.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPresidentItemStateChanged(evt);
            }
        });
        cmbPresident.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbPresidentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbPresidentMouseReleased(evt);
            }
        });
        cmbPresident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPresidentActionPerformed(evt);
            }
        });
        pnlVote.add(cmbPresident, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, 30));

        cmbUnionMember.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUnionMemberItemStateChanged(evt);
            }
        });
        cmbUnionMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbUnionMemberMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbUnionMemberMouseReleased(evt);
            }
        });
        cmbUnionMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnionMemberActionPerformed(evt);
            }
        });
        pnlVote.add(cmbUnionMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Your Votes");
        pnlVote.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 100, 30));

        tblBallot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Post", "Candicate No.", "Candicate Name"
            }
        ));
        jScrollPane1.setViewportView(tblBallot);

        pnlVote.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 410, 130));

        jXButton1.setText("Send Vote");
        jXButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton1ActionPerformed(evt);
            }
        });
        pnlVote.add(jXButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 190, 40));

        pnlBlt.add(pnlVote, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 960, 320));

        lblId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblId.setText("E001");
        pnlBlt.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Year");
        pnlBlt.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 60, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Election ");
        pnlBlt.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 30));

        pnlPnl.add(pnlBlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 970, 450));

        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlPnl.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1010, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            // try {
            String name = txtIndex.getText();
            System.out.println("name"+name);
            List<VoterDTO> getVoter = VoterController.getAllVoter();
            System.out.println("list"+getVoter);
            int i=0;
            for (VoterDTO voterDTO : getVoter) {
                
                if (voterDTO.getIndexNo().equals(name)) {
                    i++;
                    VoterDTO vd = VoterController.searchVoter(txtIndex.getText());
                    String pwrd = txtPwrd.getText();
                    System.out.println("pview" + pwrd);
                    if (pwrd.equals(vd.getPassword())) {
                        pnlVote.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong password.. Try Again!");
                    }
                } else{
                    //JOptionPane.showMessageDialog(this, "No such voter");
                }
            }if(i==0){
                JOptionPane.showMessageDialog(this,"No such Voter.. Try Again");
            }

        } catch (Exception ex) {
            Logger.getLogger(LogInBallot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbSecretartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSecretartItemStateChanged
        try {
            String secretary = (String) cmbSecretart.getSelectedItem();
            CandidateDTO cdto = CandidateController.searchCandidate(secretary);
            String name = cdto.getName();

            DefaultTableModel dtm = (DefaultTableModel) tblBallot.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String post = (String) dtm.getValueAt(i, 0);
                if (post.equals("Secretary")) {
                    dtm.removeRow(i);
                }
            }

            Object[] rowData = {"Secretary", secretary, name};
            dtm.addRow(rowData);
        } catch (Exception ex) {
            Logger.getLogger(BallotPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSecretartItemStateChanged

    private void cmbSecretartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSecretartMousePressed

    }//GEN-LAST:event_cmbSecretartMousePressed

    private void cmbSecretartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSecretartMouseReleased

    }//GEN-LAST:event_cmbSecretartMouseReleased

    private void cmbSecretartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSecretartActionPerformed

    }//GEN-LAST:event_cmbSecretartActionPerformed

    private void cmbPresidentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPresidentItemStateChanged
        try {
            String president = (String) cmbPresident.getSelectedItem();
            CandidateDTO candidateDTO = CandidateController.searchCandidate(president);
            String name = candidateDTO.getName();

            DefaultTableModel dtm = (DefaultTableModel) tblBallot.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String post = (String) dtm.getValueAt(i, 0);
                if (post.equals("President")) {
                    dtm.removeRow(i);
                }
            }

            Object[] rowData = {"President", president, name};
            dtm.addRow(rowData);

        } catch (Exception ex) {
            Logger.getLogger(BallotPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbPresidentItemStateChanged

    private void cmbPresidentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPresidentMousePressed

    }//GEN-LAST:event_cmbPresidentMousePressed

    private void cmbPresidentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPresidentMouseReleased

    }//GEN-LAST:event_cmbPresidentMouseReleased

    private void cmbPresidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPresidentActionPerformed

    }//GEN-LAST:event_cmbPresidentActionPerformed

    private void cmbUnionMemberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUnionMemberItemStateChanged
        try {
            String uniMem = (String) cmbUnionMember.getSelectedItem();
            CandidateDTO cdto = CandidateController.searchCandidate(uniMem);
            String name = cdto.getName();

            DefaultTableModel dtm = (DefaultTableModel) tblBallot.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String post = (String) dtm.getValueAt(i, 0);
                if (post.equals("Union_Member")) {
                    dtm.removeRow(i);
                }
            }

            Object[] rowData = {"Union_Member", uniMem, name};
            dtm.addRow(rowData);
        } catch (Exception ex) {
            Logger.getLogger(BallotPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbUnionMemberItemStateChanged

    private void cmbUnionMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUnionMemberMousePressed

    }//GEN-LAST:event_cmbUnionMemberMousePressed

    private void cmbUnionMemberMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUnionMemberMouseReleased

    }//GEN-LAST:event_cmbUnionMemberMouseReleased

    private void cmbUnionMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnionMemberActionPerformed

    }//GEN-LAST:event_cmbUnionMemberActionPerformed

    private void jXButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton1ActionPerformed
        try {

            List<VoteDTO> list = new ArrayList<>();
            VoteDTO vote = new VoteDTO();
            VoterDTO voter = new VoterDTO();
            CandidateDTO dto = new CandidateDTO();
            for (int i = 0; i < dtm.getRowCount(); i++) {

                vote = new VoteDTO();
                voter = new VoterDTO();
                dto = new CandidateDTO();
                String voterIndex = txtIndex.getText();
                String candicateId = (String) dtm.getValueAt(i, 1);
                voter.setIndexNo(voterIndex);
                VoterDTO vd = VoterController.searchVoter(voterIndex);

                System.out.println("null" + vd.getAddress());

                voter.setAddress(vd.getAddress());
                voter.setContact(vd.getContact());
                voter.setName(vd.getName());
                voter.setPassword(vd.getPassword());
                voter.setTpNo(vd.getTpNo());
               
                dto.setcId(candicateId);
                CandidateDTO cd = CandidateController.searchCandidate(candicateId);
                dto.setAddress(cd.getAddress());
                dto.setDesignationDetail(cd.getDesignationDetail());
                dto.setEmail(cd.getEmail());
                dto.setFileName(cd.getFileName());
                dto.setImage(cd.getImage());
                dto.setIndexNo(cd.getIndexNo());
                dto.setName(cd.getName());
                dto.setNic(cd.getNic());
                dto.setOtherDetail(cd.getOtherDetail());
                dto.setPassword(cd.getPassword());
                dto.setPost(cd.getPost());
                dto.setTpNo(cd.getTpNo());
                dto.setServiceDetail(cd.getServiceDetail());
                dto.setVisionDetail(cd.getVisionDetail());

                vote.setCandidate(dto);
                vote.setVoter(voter);
                vote.seteId(lblId.getText());
                list.add(vote);
            }

            VotesDTO d = new VotesDTO();
            d.setCandidateDTO(dto);
            d.setVoter(voter);
            d.seteId(lblId.getText());
            d.setList(list);
            boolean addVote = VoteController.addVotess(d);
            if (addVote) {
                JOptionPane.showMessageDialog(this, "Added success");
            } else {
                JOptionPane.showMessageDialog(this, "Added Fail");
            }
        } catch (Exception ex) {
            Logger.getLogger(BallotPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jXButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInBallot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPresident;
    private javax.swing.JComboBox<String> cmbSecretart;
    private javax.swing.JComboBox<String> cmbUnionMember;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXButton jXButton1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JPanel pnlBlt;
    private javax.swing.JPanel pnlLog;
    private org.jdesktop.swingx.JXPanel pnlPnl;
    private javax.swing.JPanel pnlVote;
    private org.jdesktop.swingx.JXTable tblBallot;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JPasswordField txtPwrd;
    // End of variables declaration//GEN-END:variables

    private void setPpr() {
        Result r = new Result();
        //pnlPnl.removeAll();
        pnlPnl.add(r);

        r.setVisible(true);
    }

    private void loadData() {
        try {
            List<CandidateDTO> getAll = CandidateController.getAllCandidates();
            for (CandidateDTO candidateDTO : getAll) {
                if (candidateDTO.getPost() != null) {
                    if (candidateDTO.getPost().equals("Secretary")) {
                        String cId = candidateDTO.getcId();
                        cmbSecretart.addItem(cId);
                    } else if (candidateDTO.getPost().equals("President")) {
                        cmbPresident.addItem(candidateDTO.getcId());
                    } else {
                        cmbUnionMember.addItem(candidateDTO.getcId());
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(BallotPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}