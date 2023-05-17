/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_a_akmal.controller;

import uts_a_akmal.view.FormPdam;
import uts_a_akmal.model.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC12
 */
public class PdamController {
    private FormPdam formPdam;
    private PdamDao pdamDao;
    private Pdam pdam;
    
    public PdamController(FormPdam formPdam){
        this.formPdam = formPdam;
        pdamDao = new PdamDaoImpl();
    }
    
    public void bersihForm(){
        formPdam.getTxtkodepelanggan().setText("");
        formPdam.getTxtnama().setText("");
        formPdam.getTxtmeterbulanini().setText("");
        formPdam.getTxtmeterbulanlalu().setText("");
        formPdam.getTxttarif().setText("");
        formPdam.getTxtdiskon().setText("");
        
    }
    
    public void savePdam(){
        pdam = new Pdam();
        pdam.setKodepelanggan(formPdam.getTxtkodepelanggan().getText());
        pdam.setNama(formPdam.getTxtnama().getText());
        pdam.setMeterbulanini(formPdam.getTxtmeterbulanini().getText());
        pdam.setMeterbulanlalu(formPdam.getTxtmeterbulanlalu().getText());
        pdam.setTarif(formPdam.getTxttarif().getText());
        pdam.setDiskon(formPdam.getTxtdiskon().getText());
        pdamDao.save(pdam);
        javax.swing.JOptionPane.showMessageDialog(formPdam, "Entri Ok");
    }
    
    public void getPdam(){
        int index = formPdam.getTblpdam().getSelectedRow();
        pdam = pdamDao.getPdam(index);
        if(pdam != null){
            formPdam.getTxtkodepelanggan().setText(pdam.getkodepelanggan());
            formPdam.getTxtnama().setText(pdam.getNama());
            formPdam.getTxtmeterbulanini().setText(pdam.getMeterbulanini());
            formPdam.getTxtmeterbulanlalu().setText(pdam.getMeterbulanlalu());
            formPdam.getTxttarif().setText(pdam.getTarif());
            formPdam.getTxtdiskon().setText(pdam.getDiskon());
        }
    }
    
    public void updatepdam(){
        int index = formPdam.getTblpdam().getSelectedRow();
       pdam.setKodepelanggan(formPdam.getTxtkodepelanggan().getText());
        pdam.setNama(formPdam.getTxtnama().getText());
        pdam.setMeterbulanini(formPdam.getTxtmeterbulanini().getText());
        pdam.setMeterbulanlalu(formPdam.getTxtmeterbulanlalu().getText());
        pdam.setTarif(formPdam.getTxttarif().getText());
        pdam.setDiskon(formPdam.getTxtdiskon().getText());

        pdamDao.update(index,pdam);
    }
    
    public void deletepdam(){
        int index = formPdam.getTblpdam().getSelectedRow();
        pdamDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPdam, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPdam.getTblpdam().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pdam> list = pdamDao.getAll();
        for(Pdam pdam : list){
            Object[] data = {
                pdam.getkodepelanggan(),
                pdam.getNama(),
                pdam.getMeterbulanini(),
                pdam.getMeterbulanlalu(),
                pdam.getTarif(),
                pdam.getDiskon()
            };
            tabelModel.addRow(data);
        }
    }
}

