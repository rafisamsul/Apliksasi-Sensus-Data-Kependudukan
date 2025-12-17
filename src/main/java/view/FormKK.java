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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("NO KK");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("KEPALA KELUARGA");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("KODE POS");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("RT RW");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("DESA/KELURAHAN");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("KABUPATEN/KOTA");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("PROVINSI");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

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
        tblKK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKK);

        jLabel10.setText("KECAMATAN");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNoKK, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(txtKepalaKeluarga)
                                .addComponent(txtKodePos)
                                .addComponent(txtRtRw)
                                .addComponent(txtDesa)
                                .addComponent(txtKab)
                                .addComponent(txtProv))
                            .addComponent(txtKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(btnTambah)
                        .addGap(42, 42, 42)
                        .addComponent(btnUbah)
                        .addGap(43, 43, 43)
                        .addComponent(btnHapus)
                        .addGap(42, 42, 42)
                        .addComponent(btnKembali)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKepalaKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKodePos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRtRw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah)
                        .addComponent(btnUbah)
                        .addComponent(btnHapus)
                        .addComponent(btnKembali)
                        .addComponent(txtKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtKab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel10;
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
