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
        setSize(800,450);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKtp = new javax.swing.JButton();
        btnKK = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKtp.setText("FORM KTP");
        btnKtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKtpActionPerformed(evt);
            }
        });

        btnKK.setText("FORM KK");
        btnKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKKActionPerformed(evt);
            }
        });

        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnKtp)
                .addGap(18, 18, 18)
                .addComponent(btnKK)
                .addGap(31, 31, 31)
                .addComponent(btnLogout)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKtp)
                    .addComponent(btnKK)
                    .addComponent(btnLogout))
                .addGap(70, 70, 70))
        );

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
    // End of variables declaration//GEN-END:variables
}
