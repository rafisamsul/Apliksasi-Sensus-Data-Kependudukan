/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author ASUS
 */
public class DataKTP {
    
    private String nik;
    private String nama;
    private String ttl;
    private String jenisKelamin;
    private String alamat;
    private String agama;
    private String status;
    private String pekerjaan;
    private String kewarganegaraan;
 
    public DataKTP (String nik, String nama, String ttl, String jenisKelamin, String alamat, String agama, String status, String pekerjaan, String kewarganegaraan){
        
        this.nik = nik;
        this.nama = nama;
        this.ttl = ttl;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
    }
 
    public String getNik(){
        return nik;
    }
    public String getNama(){
        return nama;
    }
    public String getTtl(){
        return ttl;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getAgama(){
        return agama;
    }
    public String getStatus(){
        return status;
    }
    public String getPekerjaan(){
        return pekerjaan;
    }
    public String getKewarganegaraan(){
        return kewarganegaraan;
    }
}
