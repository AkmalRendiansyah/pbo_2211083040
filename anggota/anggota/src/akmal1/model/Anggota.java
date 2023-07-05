/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akmal1.model;

/**
 *
 * @author LABP1KOMP
 */
public class Anggota {
    private String KodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
     public Anggota(){
         
     }
    public Anggota(String kodeAnggota,String namaAnggota,String alamat,String jenisKelamin){
        this.KodeAnggota =kodeAnggota;
        this.namaAnggota =namaAnggota;
        this.alamat =alamat;
        this.jenisKelamin =jenisKelamin;
    }
    public String getKodeAnggota(){
        return KodeAnggota;
    }
    public void setKodeAnggota(String kodeAnggota){
        this.KodeAnggota = kodeAnggota;
    }
    public String getNamaAnggota(){
        return namaAnggota;
    }
    public void setNamaAnggota(String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
        public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
        public String getJenisKelamin(){
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
}
