/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import config.Database;
import model.dataKK;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class dataKKController {
    
        public DefaultTableModel getTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO KK");
        model.addColumn("Kepala Keluarga");
        model.addColumn("KodePos");
        model.addColumn("Rt Rw");
        model.addColumn("Desa Kelurahan");
        model.addColumn("Kecamatan");
        model.addColumn("Kabupaten Kota");
        model.addColumn("Provinsi");
        
        return model;
    }
 
    public void loadData(DefaultTableModel model) {
    model.setRowCount(0); // Clear existing data
    String sql = "SELECT * FROM dataKK";
 
    try (Connection conn = Database.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
 
        while(rs.next()) {
            model.addRow(new Object[]{
                rs.getString("noKK"),
                rs.getString("kepalaKeluarga"),
                rs.getString("kodePos"),
                rs.getString("RtRw"),
                rs.getString("desaKelurahan"),
                rs.getString("kecamatan"),
                rs.getString("kabupatenKota"),
                rs.getString("provinsi"),
            });
        }
    } catch (SQLException e) {
        throw new RuntimeException("Gagal memuat data: " + e.getMessage());
    }
}
 
    public void tambahData(dataKK m) {
        String sql = "INSERT INTO dataKK VALUES (?,?,?,?,?,?,?,?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, m.getNoKK());
            pstmt.setString(2, m.getKepalaKeluarga());
            pstmt.setString(3, m.getKodePos());
            pstmt.setString(4, m.getRtRw());
            pstmt.setString(5, m.getDesaKelurahan());
            pstmt.setString(6, m.getKecamatan());
            pstmt.setString(7, m.getKabupatenKota());
            pstmt.setString(8, m.getProvinsi());
 
 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Gagal menambah data", e);
        }
    }
 
 
 
public void ubahData(dataKK m) {
    String sql = "UPDATE dataKK SET kepalaKeluarga=?, kodePos=?, RtRw=?, desaKelurahan=?, " +
                 "Kecamatan=?, kabupatenKota=?, provinsi=? WHERE noKK=?";
                 
    try (Connection conn = Database.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Urutan parameter harus sesuai dengan tanda tanya (?) di atas
        pstmt.setString(1, m.getKepalaKeluarga());
        pstmt.setString(2, m.getKodePos());
        pstmt.setString(3, m.getRtRw());
        pstmt.setString(4, m.getDesaKelurahan());
        pstmt.setString(5, m.getKecamatan());
        pstmt.setString(6, m.getKabupatenKota());
        pstmt.setString(7, m.getProvinsi());
        
        // Parameter terakhir adalah NIM (untuk WHERE)
        pstmt.setString(8, m.getNoKK());

        pstmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException("Gagal mengubah data: " + e.getMessage());
    }
}
 
 
    public void hapusData(String noKK) {
        String sql = "DELETE FROM dataKK WHERE noKK=?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            pstmt.setString(1, noKK);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Gagal menghapus data", e);
        }
    }
 
}
