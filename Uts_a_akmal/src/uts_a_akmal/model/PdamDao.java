/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uts_a_akmal.model;
import java.util.List;
/**
 *
 * @author PC12
 */
public interface PdamDao {
    void save(Pdam pdam);
    void update(int index,Pdam pdam);
    void delete(int index);
    Pdam getPdam(int index);
    List<Pdam> getAll();
}   

