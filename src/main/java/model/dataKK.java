/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class dataKK {
    private String noKK;
    private String kepalaKeluarga;
    private String kodePos;
    private String RtRw;
    private String desaKelurahan;
    private String kecamatan;
    private String kabupatenKota;
    private String provinsi;
 
    public dataKK (String noKK, String kepalaKeluarga, String kodePos, String RtRw, String desaKelurahan, String kecamatan, String kabupatenKota, String provinsi){
        
        this.noKK = noKK;
        this.kepalaKeluarga = kepalaKeluarga;
        this.kodePos = kodePos;
        this.RtRw = RtRw;
        this.desaKelurahan = desaKelurahan;
        this.kecamatan = kecamatan;
        this.kabupatenKota = kabupatenKota;
        this.provinsi = provinsi;
    }
 
    public String getNoKK(){
        return noKK;
    }
    public String getKepalaKeluarga(){
        return kepalaKeluarga;
    }
    public String getKodePos(){
        return kodePos;
    }
    public String getRtRw(){
        return RtRw;
    }
    public String getDesaKelurahan(){
        return desaKelurahan;
    }
    public String getKecamatan(){
        return kecamatan;
    }
    public String getKabupatenKota(){
        return kabupatenKota;
    }
    public String getProvinsi(){
        return provinsi;
    }
}
