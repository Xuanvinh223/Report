/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happywedding.view.manage;

/**
 *
 * @author ADMIN
 */
public class DuaDon extends javax.swing.JDialog {

    /**
     * Creates new form DuaDon
     */
    public DuaDon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel8 = new javax.swing.JLabel();
        lblMaNH = new javax.swing.JLabel();
        txtGioKhoiHanh = new javax.swing.JTextField();
        txtGioVe = new javax.swing.JTextField();
        txtSoLuongKhach = new javax.swing.JTextField();
        lblMaNH6 = new javax.swing.JLabel();
        lblMaNH7 = new javax.swing.JLabel();
        lblMaNH8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDiaDiem = new javax.swing.JTextArea();
        lblMaNH9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtTongCPPS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTongChiPhi = new javax.swing.JTextField();
        btnReset = new com.ui.swing.HoverButton();
        btnSave1 = new com.ui.swing.HoverButton();
        btnHuy = new com.ui.swing.HoverButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("????a ????n");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblMaNH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMaNH.setText("Gi??? kh???i h??nh");
        jPanel1.add(lblMaNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        txtGioKhoiHanh.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txtGioKhoiHanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, 35));

        txtGioVe.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtGioVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioVeActionPerformed(evt);
            }
        });
        jPanel1.add(txtGioVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, 35));

        txtSoLuongKhach.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSoLuongKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongKhachActionPerformed(evt);
            }
        });
        jPanel1.add(txtSoLuongKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 360, 35));

        lblMaNH6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMaNH6.setText("S??? l?????ng kh??ch");
        jPanel1.add(lblMaNH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        lblMaNH7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMaNH7.setText("Gi??? v???");
        jPanel1.add(lblMaNH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 60, 30));

        lblMaNH8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMaNH8.setText("?????a di???m ????n");
        jPanel1.add(lblMaNH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 30));

        taDiaDiem.setColumns(20);
        taDiaDiem.setRows(5);
        jScrollPane1.setViewportView(taDiaDiem);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 360, 80));

        lblMaNH9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMaNH9.setText("Ghi ch??");
        jPanel1.add(lblMaNH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 90, 30));

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 360, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("T???ng chi ph??t ph??t sinh");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        txtTongCPPS.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTongCPPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongCPPSActionPerformed(evt);
            }
        });
        jPanel1.add(txtTongCPPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 230, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("T???ng chi ph?? ph???i tr???");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        txtTongChiPhi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTongChiPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongChiPhiActionPerformed(evt);
            }
        });
        jPanel1.add(txtTongChiPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 240, 35));

        btnReset.setBackground(new java.awt.Color(24, 37, 153));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("L??m m???i");
        btnReset.setBorderColor(new java.awt.Color(24, 37, 153));
        btnReset.setColor(new java.awt.Color(24, 37, 153));
        btnReset.setColorClick(new java.awt.Color(51, 51, 255));
        btnReset.setColorOver(new java.awt.Color(51, 51, 255));
        btnReset.setFocusPainted(false);
        btnReset.setLabelColor(java.awt.Color.white);
        btnReset.setLableColorClick(java.awt.Color.white);
        btnReset.setRadius(15);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, 30));

        btnSave1.setBackground(new java.awt.Color(24, 153, 29));
        btnSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnSave1.setText("L??u");
        btnSave1.setBorderColor(new java.awt.Color(24, 153, 29));
        btnSave1.setColor(new java.awt.Color(24, 153, 29));
        btnSave1.setColorClick(new java.awt.Color(0, 204, 0));
        btnSave1.setColorOver(new java.awt.Color(0, 204, 0));
        btnSave1.setFocusPainted(false);
        btnSave1.setLabelColor(java.awt.Color.white);
        btnSave1.setLableColorClick(java.awt.Color.white);
        btnSave1.setRadius(15);
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, 30));

        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("H???y");
        btnHuy.setBorderColor(new java.awt.Color(153, 24, 24));
        btnHuy.setColor(new java.awt.Color(153, 24, 24));
        btnHuy.setColorClick(new java.awt.Color(255, 51, 51));
        btnHuy.setColorOver(new java.awt.Color(255, 51, 51));
        btnHuy.setFocusPainted(false);
        btnHuy.setLabelColor(java.awt.Color.white);
        btnHuy.setLableColorClick(java.awt.Color.white);
        btnHuy.setRadius(15);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGioVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioVeActionPerformed

    private void txtSoLuongKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongKhachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongKhachActionPerformed

    private void txtTongCPPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongCPPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongCPPSActionPerformed

    private void txtTongChiPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongChiPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongChiPhiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

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
            java.util.logging.Logger.getLogger(DuaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DuaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DuaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DuaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DuaDon dialog = new DuaDon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ui.swing.HoverButton btnHuy;
    private com.ui.swing.HoverButton btnReset;
    private com.ui.swing.HoverButton btnSave1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMaNH;
    private javax.swing.JLabel lblMaNH6;
    private javax.swing.JLabel lblMaNH7;
    private javax.swing.JLabel lblMaNH8;
    private javax.swing.JLabel lblMaNH9;
    private javax.swing.JTextArea taDiaDiem;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGioKhoiHanh;
    private javax.swing.JTextField txtGioVe;
    private javax.swing.JTextField txtSoLuongKhach;
    private javax.swing.JTextField txtTongCPPS;
    private javax.swing.JTextField txtTongChiPhi;
    // End of variables declaration//GEN-END:variables
}
