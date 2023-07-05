/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package akmal3040.dao;
import akmal3040.model.Peminjaman;
import java.sql.*;
import java.util.List;
/**
 *
 * @author akmal
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp, String kodebuku, String tglPinjam, String tglKembali) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
