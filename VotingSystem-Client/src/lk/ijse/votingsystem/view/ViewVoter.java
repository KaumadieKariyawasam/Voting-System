/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.view;


import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ViewVoter extends javax.swing.JInternalFrame implements Observerr{

    /**
     * Creates new form ViewVoter
     */
    private static JPanel internForm;

    
    public ViewVoter(JPanel internalFrame){
         initComponents();
         internForm=internalFrame;
        loadVoters();
         try {
           UnicastRemoteObject.exportObject(this, 0);
           VoterController.getSubject().registerObserver(this);
           VoterController.getSubject().notifyObservers();
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
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoters = new org.jdesktop.swingx.JXTable();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setText("All Voters");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 360, 50));

        tblVoters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index No.", "Name", "NIC No.", "Contact", "Address"
            }
        ));
        tblVoters.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tblVoters);

        jXPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 860, 310));

        jXLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jXLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/votingsystem/image/Back.png"))); // NOI18N
        jXLabel2.setText("Back");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXLabel2.setOpaque(true);
        jXLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jXLabel2MousePressed(evt);
            }
        });
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, 50));

        jXLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 980, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel2MousePressed
        ManageVoters v=new ManageVoters((JXPanel) internForm);
        internForm.removeAll();
        internForm.add(v);
        v.setVisible(true); 
    }//GEN-LAST:event_jXLabel2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTable tblVoters;
    // End of variables declaration//GEN-END:variables

    public void loadVoters() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) tblVoters.getModel();
            List<VoterDTO> allVoter=VoterController.getAllVoter();
            dtm.setRowCount(0);
            if(allVoter==null){
                return;
            }
            for (VoterDTO voterDTO : allVoter) {
                Object[] rowData={voterDTO.getIndexNo(),voterDTO.getName(),voterDTO.getTpNo(),voterDTO.getContact(),voterDTO.getAddress()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewVoter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateObservers() throws Exception {
        loadVoters();
    }
}
