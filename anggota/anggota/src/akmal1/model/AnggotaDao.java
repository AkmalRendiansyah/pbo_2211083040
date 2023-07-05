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
public interface AnggotaDao {
    void save(Anggota anggota);
    void update(int index,Anggota anggota);
    void delete(int index);
    Anggota getAnggota(int index);
    public List<Anggota> getAllAnggota();
}
