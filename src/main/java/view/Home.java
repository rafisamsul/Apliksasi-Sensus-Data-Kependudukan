/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.io.IOException;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        setSize(955,479);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKtp = new javax.swing.JButton();
        btnKK = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKtp.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnKtp.setText("FORM KTP");
        btnKtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKtpActionPerformed(evt);
            }
        });
        getContentPane().add(btnKtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        btnKK.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        btnKK.setText("FORM KK");
        btnKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKKActionPerformed(evt);
            }
        });
        getContentPane().add(btnKK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 160, -1));

        btnLogout.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/gambar5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKtpActionPerformed
    this.setVisible(false);
    
        //buat dan tampilkan form ktp
        FormKTP formKTP = new FormKTP(this);
        formKTP.setVisible(true);
        
    }//GEN-LAST:event_btnKtpActionPerformed

    private void btnKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKKActionPerformed
    this.setVisible(false);
    
        //buat dan tampilkan form ktp
        FormKK formKK = new FormKK(this);
        formKK.setVisible(true);
        
    }//GEN-LAST:event_btnKKActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

    int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "Apakah anda yakin ingin keluar?", 
            "Konfirmasi Logout", 
            javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {

        this.dispose();

        new view.FormLogin().setVisible(true);
    }
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKK;
    private javax.swing.JButton btnKtp;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
