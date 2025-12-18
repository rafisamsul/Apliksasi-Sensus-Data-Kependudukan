/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.dataKKController;
import controller.dataKTPController;
import java.awt.HeadlessException;
import model.DataKTP;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class FormKTP extends javax.swing.JFrame {
    
    private final dataKTPController controller;
    private Home halamanHome;
    
    private final String[] JenisKelamin_OPTIONS = {
        "Laki-Laki",
        "Perempuan"
    };
    
    private final String[] Agama_OPTIONS = {
        "Islam",
        "Kristen",
        "Katolik",
        "Hindu",
        "Buddha",
        "khonghucu"
    };
    
    private DefaultTableModel model;
    
    public FormKTP() {
    controller = new dataKTPController();
    initComponents();
    initJenisKelaminComboBox();
    initAgamaComboBox();
    initTable();
    loadData();
    setSize(955,479);
    setLocationRelativeTo(null);
}

    public FormKTP(Home home) {
        initComponents();
        controller = new dataKTPController(); 
        initTable();
        loadData();
        setLocationRelativeTo(null);
        
        // Simpan Home yang dikirim ke variabel
        this.halamanHome = home; 
    }

    private void initJenisKelaminComboBox(){
        cmbJenisKelamin.removeAllItems();
        for (String jenisKelamin : JenisKelamin_OPTIONS){
            cmbJenisKelamin.addItem(jenisKelamin);
        }
    }
    
    private void initAgamaComboBox(){
        cmbAgama.removeAllItems();
        for (String agama : Agama_OPTIONS){
            cmbAgama.addItem(agama);
        }
    }
 
    private void initTable() {
    model = new DefaultTableModel(
        new Object[]{"NIK", "Nama", "TTL", "Jenis Kelamin", "Alamat", "Agama", "Status", "Pekerjaan", "Kewarganegaraan"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Non-editable table
        }
    };
    tblKtp.setModel(model);
 
    }
 
    private void loadData() {
    model.setRowCount(0); 
    controller.loadData(model); // Gunakan model yang sama
    tblKtp.setModel(model); // Pastikan model terpasang 
    }
    
    private void clearForm() {
    txtNik.setText("");
    txtNama.setText("");
    txtTtl.setText("");
    cmbJenisKelamin.setSelectedIndex(0);
    txtAlamat.setText("");
    cmbAgama.setSelectedIndex(0);
    txtStatus.setText("");
    txtPekerjaan.setText("");
    txtKewarganegaraan.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKewarganegaraan = new javax.swing.JTextField();
        txtPekerjaan = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTtl = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNik = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        cmbAgama = new javax.swing.JComboBox<>();
        cmbJenisKelamin = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKtp = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("NAMA");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 61, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("NIK");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 61, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("TTL");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 61, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("ALAMAT");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 61, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("JENIS KELAMIN");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("AGAMA");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("STATUS");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("PEKERJAAN");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("KEWARGANEGARAAN");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));
        getContentPane().add(txtKewarganegaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 151, -1));
        getContentPane().add(txtPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 151, -1));
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 151, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 151, -1));
        getContentPane().add(txtTtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 151, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 151, -1));
        getContentPane().add(txtNik, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 151, -1));

        btnTambah.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        btnUbah.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 78, -1));

        btnHapus.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 78, -1));

        btnKembali.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        cmbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Buddha", "Hindu", "Konghucu" }));
        getContentPane().add(cmbAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 100, -1));

        cmbJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        getContentPane().add(cmbJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, -1));

        tblKtp.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblKtp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "NAMA", "TTL", "ALAMAT", "JENIS KELAMIN", "AGAMA", "STATUS", "PEKERJAAN", "KEWARGANEGARAAN"
            }
        ));
        tblKtp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKtpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKtp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 239, 900, 190));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("KEWARGANEGARAAN");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desain/gambar2.png"))); // NOI18N
        getContentPane().add(gambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel13.setText("KEWARGANEGARAAN");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if (txtNik.getText().trim().isEmpty() ||
        txtNama.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
        return;
    }

    DataKTP m = new DataKTP(
        txtNik.getText().trim(),
        txtNama.getText().trim(),
        txtTtl.getText().trim(),
        cmbJenisKelamin.getSelectedItem().toString(),
        txtAlamat.getText().trim(),
        cmbAgama.getSelectedItem().toString(),
        txtStatus.getText().trim(),
        txtPekerjaan.getText().trim(),
        txtKewarganegaraan.getText().trim()
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
    int row = tblKtp.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah");
        return;
    }

    String nikAsli = model.getValueAt(row, 0).toString();

    DataKTP m = new DataKTP(
        nikAsli,
        txtNama.getText().trim(),
        txtTtl.getText().trim(),
        cmbJenisKelamin.getSelectedItem().toString(),
        txtAlamat.getText().trim(),
        cmbAgama.getSelectedItem().toString(),
        txtStatus.getText().trim(),
        txtPekerjaan.getText().trim(),
        txtKewarganegaraan.getText().trim()
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

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tblKtp.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus");
        return;
    }

    String nik = model.getValueAt(row, 0).toString();

    int confirm = JOptionPane.showConfirmDialog(
            this, 
            "Hapus data NIK " + nik + " ?", 
            "Konfirmasi", 
            JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            controller.hapusData(nik);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            loadData();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
    this.dispose(); 
    
        if (this.halamanHome != null) {
            this.halamanHome.setVisible(true);
        } else {
            new Home().setVisible(true);
        } 
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tblKtpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKtpMouseClicked
        int row = tblKtp.getSelectedRow();

    txtNik.setText(model.getValueAt(row, 0).toString());
    txtNama.setText(model.getValueAt(row, 1).toString());
    txtTtl.setText(model.getValueAt(row, 2).toString());
    cmbJenisKelamin.setSelectedItem(model.getValueAt(row, 3).toString());
    txtAlamat.setText(model.getValueAt(row, 4).toString());
    cmbAgama.setSelectedItem(model.getValueAt(row, 5).toString());
    txtStatus.setText(model.getValueAt(row, 6).toString());
    txtPekerjaan.setText(model.getValueAt(row, 7).toString());
    txtKewarganegaraan.setText(model.getValueAt(row, 8).toString());
    
    }//GEN-LAST:event_tblKtpMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbAgama;
    private javax.swing.JComboBox<String> cmbJenisKelamin;
    private javax.swing.JLabel gambar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKtp;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKewarganegaraan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTtl;
    // End of variables declaration//GEN-END:variables
}
