/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_a_akmal.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC12
 */
public class PdamDaoImpl implements PdamDao {
     List<Pdam> data = new ArrayList<>();
    public PdamDaoImpl(){
        data.add(new Pdam("111111","Ali","40","10","670000","20%"));
    }
    public void save(Pdam pdam){
        data.add(pdam);
    }
    public void update(int index,Pdam pdam){
        data.set(index, pdam);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pdam getPdam(int index){
        return data.get(index);
    }
    public List<Pdam> getAll(){
        return data;
    }
}
