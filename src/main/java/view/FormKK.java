/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.dataKKController;
import java.awt.HeadlessException;
import model.dataKK;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class FormKK extends javax.swing.JFrame {
    
    private final dataKKController controller;
    private DefaultTableModel model;
    private Home halamanHome;
    
    public FormKK() {
    controller = new dataKKController();
    initComponents();
    initTable();
    loadData();
    setLocationRelativeTo(null);
}

    public FormKK(Home home) {
        initComponents();
        controller = new dataKKController(); 
        initTable();
        loadData();
        setSize(955,479);
        setLocationRelativeTo(null);
        
        // Simpan Home yang dikirim ke variabel
        this.halamanHome = home; 
    }
    
    private void initTable() {
    model = new DefaultTableModel(
        new Object[]{"NO KK", "KEPALA KELUARGA", "KODE POS", "RT RW", "DESA/KELURAHAN", "KECAMATAN", "KABUPATEN/KOTA", "PROVINSI"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Non-editable table
        }
    };
    tblKK.setModel(model);
 
    }
 
    private void loadData() {
    model.setRowCount(0); 
    controller.loadData(model); // Gunakan model yang sama
    tblKK.setModel(model); // Pastikan model terpasang 
    }
    
    private void clearForm() {
    txtNoKK.setText("");
    txtKepalaKeluarga.setText("");
    txtKodePos.setText("");
    txtRtRw.setText("");
    txtDesa.setText("");
    txtKecamatan.setText("");
    txtKab.setText("");
    txtProv.setText("");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNoKK = new javax.swing.JTextField();
        txtKepalaKeluarga = new javax.swing.JTextField();
        txtKodePos = new javax.swing.JTextField();
        txtRtRw = new javax.swing.JTextField();
        txtDesa = new javax.swing.JTextField();
        txtKab = new javax.swing.JTextField();
        txtProv = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKK = new javax.swing.JTable();
        txtKecamatan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("NO KK");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, -1));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("KEPALA KELUARGA");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("KODE POS");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("RT RW");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 61, -1));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("DESA/KELURAHAN");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("KABUPATEN/KOTA");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("PROVINSI");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 61, -1));
        getContentPane().add(txtNoKK, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 31, 122, -1));
        getContentPane().add(txtKepalaKeluarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 122, -1));
        getContentPane().add(txtKodePos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 122, -1));
        getContentPane().add(txtRtRw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 122, -1));
        getContentPane().add(txtDesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 122, -1));
        getContentPane().add(txtKab, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 122, -1));
        getContentPane().add(txtProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 122, -1));

        btnTambah.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        btnUbah.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        btnHapus.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        btnKembali.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        tblKK.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblKK.setForeground(new java.awt.Color(51, 51, 51));
        tblKK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO KK", "KEPALA KELUARGA", "KODE POS", "RT RW", "DESA/KELURAHAN", "KECAMATAN", "KAB/KOTA", "PROVINSI"
            }
        ));
        tblKK.setGridColor(new java.awt.Color(255, 255, 0));
        tblKK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKK);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 190, 890, 240));

        txtKecamatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKecamatanActionPerformed(evt);
            }
        });
        getContentPane().add(txtKecamatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 122, -1));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("KECAMATAN");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 80, 20));

        gambar2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/gambar2.png"))); // NOI18N
        gambar2.setText("jLabel1");
        getContentPane().add(gambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel12.setBackground(java.awt.Color.white);
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("KABUPATEN/KOTA");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tblKK.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus");
        return;
    }

    String noKK = model.getValueAt(row, 0).toString();

    int confirm = JOptionPane.showConfirmDialog(
            this, 
            "Hapus data NIK " + noKK + " ?", 
            "Konfirmasi", 
            JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            controller.hapusData(noKK);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            loadData();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if (txtNoKK.getText().trim().isEmpty() ||
        txtKepalaKeluarga.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
        return;
    }

    dataKK m = new dataKK(
        txtNoKK.getText().trim(),
        txtKepalaKeluarga.getText().trim(),
        txtKodePos.getText().trim(),
        txtRtRw.getText().trim(),
        txtDesa.getText().trim(),
        txtKecamatan.getText().trim(),
        txtKab.getText().trim(),
        txtProv.getText().trim()
    );

    try {
        controller.tambahData(m);
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
        loadData();
        clearForm();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        int row = tblKK.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah");
        return;
    }

    String noKKAsli = model.getValueAt(row, 0).toString();

    dataKK m = new dataKK(
        noKKAsli,
        txtKepalaKeluarga.getText().trim(),
        txtKodePos.getText().trim(),
        txtRtRw.getText().trim(),
        txtDesa.getText().trim(),
        txtKecamatan.getText().trim(),
        txtKab.getText().trim(),
        txtProv.getText().trim()
    );

    try {
        controller.ubahData(m);
        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        loadData();
        clearForm();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
    this.dispose(); 
    
        if (this.halamanHome != null) {
            this.halamanHome.setVisible(true);
        } else {
            new Home().setVisible(true);
        } 
        
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tblKKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKKMouseClicked
        int row = tblKK.getSelectedRow();

    txtNoKK.setText(model.getValueAt(row, 0).toString());
    txtKepalaKeluarga.setText(model.getValueAt(row, 1).toString());
    txtKodePos.setText(model.getValueAt(row, 2).toString());
    txtRtRw.setText(model.getValueAt(row, 3).toString());
    txtDesa.setText(model.getValueAt(row, 4).toString());
    txtKecamatan.setText(model.getValueAt(row, 5).toString());
    txtKab.setText(model.getValueAt(row, 6).toString());
    txtProv.setText(model.getValueAt(row, 7).toString());
    
    }//GEN-LAST:event_tblKKMouseClicked

    private void txtKecamatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKecamatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKecamatanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel gambar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKK;
    private javax.swing.JTextField txtDesa;
    private javax.swing.JTextField txtKab;
    private javax.swing.JTextField txtKecamatan;
    private javax.swing.JTextField txtKepalaKeluarga;
    private javax.swing.JTextField txtKodePos;
    private javax.swing.JTextField txtNoKK;
    private javax.swing.JTextField txtProv;
    private javax.swing.JTextField txtRtRw;
    // End of variables declaration//GEN-END:variables
}
