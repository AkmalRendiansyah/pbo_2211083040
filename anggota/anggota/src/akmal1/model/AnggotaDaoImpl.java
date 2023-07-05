/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akmal1.model;
import java.util.*;
/**
 *
 * @author LABP1KOMP
 */
public class AnggotaDaoImpl implements AnggotaDao {
    
    List<Anggota> data = new ArrayList();
    public AnggotaDaoImpl(){
        data.add(new Anggota("98111","akmal","lolong","L"));    
    }
    public void save(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index,Anggota anggota){
         data.set(index, anggota);
    }
    public void delete(int index){
         data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAllAnggota(){
        return data;
    }
}
