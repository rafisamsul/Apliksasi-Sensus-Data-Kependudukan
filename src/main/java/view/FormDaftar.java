/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.*;
import java.sql.*;
import config.Database;

public class FormDaftar extends javax.swing.JFrame {

    public FormDaftar() {
        initComponents();
        setSize(955,479);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsn = new javax.swing.JTextField();
        btnDaftar = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        txtPw = new javax.swing.JPasswordField();
        gambar3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("DAFTAR AKUN BARU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 180, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("USSERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 180, 90, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 220, 80, -1));
        getContentPane().add(txtUsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 115, -1));

        btnDaftar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnDaftar.setText("DAFTAR");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        btnBatal.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));
        getContentPane().add(txtPw, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 112, -1));

        gambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/gambar3.png"))); // NOI18N
        getContentPane().add(gambar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        String user = txtUsn.getText().trim();
        String pass = new String(txtPw.getPassword()).trim();

        // 1. Validasi tidak boleh kosong
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username dan Password wajib diisi!");
            return;
        }

        // 2. Simpan ke Database
        try (Connection c = Database.getConnection();
             PreparedStatement p = c.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {
            
            p.setString(1, user);
            p.setString(2, pass);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Registrasi Berhasil! Silakan Login.");
            
            // 3. Pindah ke form Login
            new FormLogin().setVisible(true);
            this.dispose();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal Daftar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        new FormLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JLabel gambar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPw;
    private javax.swing.JTextField txtUsn;
    // End of variables declaration//GEN-END:variables
}
