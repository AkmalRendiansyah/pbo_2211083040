/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_a_akmal.model;

/**
 *
 * @author PC12
 */
public class Pdam {
    private String kodepelanggan;
    private String nama;
    private String meterbulanini;
    private String meterbulanlalu;
    private String tarif;
    private String diskon;
    public Pdam(){}
    
    public Pdam(String kodepelanggan, String nama, String meterbulanini,String meterbulanlalu,String tarif,String diskon){
        this.kodepelanggan = kodepelanggan;
        this.nama = nama;
        this.meterbulanini = meterbulanini;
        this.meterbulanlalu = meterbulanlalu;
        this.tarif = tarif;
         this.diskon = diskon;
    }
    
    public void setKodepelanggan(String kodepelanggan){
        this.kodepelanggan = kodepelanggan;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMeterbulanini(String meterbulanini){
        this.meterbulanini = meterbulanini;
    }
     public void setMeterbulanlalu(String meterbulanlalu){
        this.meterbulanlalu = meterbulanlalu;
    }
      public void setTarif(String tarif){
        this.tarif = tarif;
    }
       public void setDiskon(String diskon){
        this.diskon = diskon;
    }
    public String getkodepelanggan(){
        return kodepelanggan;
    }
    public String getNama(){
        return nama;
    }
    public String getMeterbulanini(){
        return meterbulanini;
    }
    public String getMeterbulanlalu(){
        return meterbulanlalu;
    }
     public String getDiskon(){
        return diskon;
    }
    public String getTarif(){
        return tarif;
    }
}

