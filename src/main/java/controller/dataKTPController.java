/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import config.Database;
import model.DataKTP;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class dataKTPController {
    
        public DefaultTableModel getTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("TTL");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Alamat");
        model.addColumn("Agama");
        model.addColumn("Status");
        model.addColumn("Pekerjaan");
        model.addColumn("Kewarganegaraan");
        return model;
    }
 
    public void loadData(DefaultTableModel model) {
    model.setRowCount(0); // Clear existing data
    String sql = "SELECT * FROM dataKTP";
 
    try (Connection conn = Database.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
 
        while(rs.next()) {
            model.addRow(new Object[]{
                rs.getString("nik"),
                rs.getString("nama"),
                rs.getString("ttl"),
                rs.getString("jenis_kelamin"),
                rs.getString("alamat"),
                rs.getString("agama"),
                rs.getString("status"),
                rs.getString("pekerjaan"),
                rs.getString("kewarganegaraan")
            });
        }
    } catch (SQLException e) {
        throw new RuntimeException("Gagal memuat data: " + e.getMessage());
    }
}
 
    public void tambahData(DataKTP m) {
        String sql = "INSERT INTO dataKTP VALUES (?,?,?,?,?,?,?,?,?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, m.getNik());
            pstmt.setString(2, m.getNama());
            pstmt.setString(3, m.getTtl());
            pstmt.setString(4, m.getJenisKelamin());
            pstmt.setString(5, m.getAlamat());
            pstmt.setString(6, m.getAgama());
            pstmt.setString(7, m.getStatus());
            pstmt.setString(8, m.getPekerjaan());
            pstmt.setString(9, m.getKewarganegaraan());
 
 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Gagal menambah data", e);
        }
    }
 
 
 
public void ubahData(DataKTP m) {
    String sql = "UPDATE dataKTP SET nama=?, ttl=?, jenis_kelamin=?, alamat=?, " +
                 "agama=?, status=?, pekerjaan=?, kewarganegaraan=? WHERE nik=?";
                 
    try (Connection conn = Database.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Urutan parameter harus sesuai dengan tanda tanya (?) di atas
        pstmt.setString(1, m.getNama());
        pstmt.setString(2, m.getTtl());
        pstmt.setString(3, m.getJenisKelamin());
        pstmt.setString(4, m.getAlamat());
        pstmt.setString(5, m.getAgama());
        pstmt.setString(6, m.getStatus());
        pstmt.setString(7, m.getPekerjaan());
        pstmt.setString(8, m.getKewarganegaraan());
        
        // Parameter terakhir adalah NIM (untuk WHERE)
        pstmt.setString(9, m.getNik());

        pstmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException("Gagal mengubah data: " + e.getMessage());
    }
}
 
 
    public void hapusData(String nik) {
        String sql = "DELETE FROM dataKTP WHERE nik=?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, nik);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Gagal menghapus data", e);
        }
    }
 
}

