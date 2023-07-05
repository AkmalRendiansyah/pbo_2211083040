/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akmal1.controller;
import akmal1.view.*;
import akmal1.model.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.List;

/**
 *
 * @author PC6
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    public void bersihForm(){
        formAnggota.gettxtKodeAnggota().setText("");
        formAnggota.gettxtNamaAnggota().setText("");
        formAnggota.gettxtAlamat().setText("");
    }
    
    public void isiCboJenisKelamin(){
        formAnggota.getcboJenisKelamin().removeAllItems();
        formAnggota.getcboJenisKelamin().addItem("L");
        formAnggota.getcboJenisKelamin().addItem("P ");
    }
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.gettxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.gettxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.gettxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getcboJenisKelamin().getSelectedItem().toString());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota,"Insert Ok"); 
    }
    public void updateAnggota(){
        int index = formAnggota.gettblAnggota().getSelectedRow();
        anggota.setKodeAnggota(formAnggota.gettxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.gettxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.gettxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getcboJenisKelamin().getSelectedItem().toString());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota,"Update Ok"); 
    }
    public void delete(){
        int index = formAnggota.gettblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota,"Delete Ok"); 
    }
    public void getAnggota(){
        int index = formAnggota.gettblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if (anggota!=null){
             formAnggota.gettxtKodeAnggota().setText(anggota.getKodeAnggota());
             formAnggota.gettxtNamaAnggota().setText(anggota.getNamaAnggota());
             formAnggota.gettxtAlamat().setText(anggota.getAlamat());
        }
    }
    public void tampil(){
        DefaultTableModel tabelmodel =
                (DefaultTableModel) formAnggota.gettblAnggota().getModel();
        tabelmodel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota1 : list){
            Object row[] = {
                anggota1.getKodeAnggota(),
                anggota1.getNamaAnggota(),
                anggota1.getAlamat(),
                anggota1.getJenisKelamin()
            };
            tabelmodel.addRow(row);
        }
        
    }
}
