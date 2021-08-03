/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.transaksi;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mesin Tempur
 */
public class executeTransaksi {
    public List<transaksi> getAlltransaksi(){
     String query = "select * from transaksi";
        ConnectionManager conMan = new ConnectionManager();
        List<transaksi> lstransaksi = new ArrayList<transaksi>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                transaksi tr = new transaksi();
                tr.setId_transaksi(rs.getString("id_transaksi"));
                tr.setTanggal_beli(rs.getString("tanggal_beli"));
                tr.setNama_pembeli(rs.getString("nama_pembeli"));
                tr.setBarang_dibeli(rs.getString("barang_dibeli"));
                tr.setJumlah_beli(rs.getInt("jumlah_beli"));
                tr.setHarga_total(rs.getInt("harga_total"));
                lstransaksi.add(tr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lstransaksi;    
    }
    
    public int insertData(transaksi tr){

        int hasil = 0;
        String query ="Insert into transaksi(id_transaksi, tanggal_beli, nama_pembeli, barang_dibeli, jumlah_beli, harga_total)"
                +" values('"+tr.getId_transaksi()+"','"+tr.getTanggal_beli()+"','"+
                tr.getNama_pembeli()+"','"+tr.getBarang_dibeli()+"',"+tr.getJumlah_beli()+","+tr.getHarga_total()+")";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int hapusData(String id_transaksi){
        String query = "Delete from transaksi where id_transaksi='"+ id_transaksi+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    
        public int ubahData(transaksi tr){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update transaksi set tanggal_beli='"+tr.getTanggal_beli()+"', nama_pembeli='"+tr.getNama_pembeli()+
                "', barang_dibeli='"+tr.getBarang_dibeli()+"', jumlah_beli="+tr.getJumlah_beli()+", harga_total="+tr.getHarga_total()+
                " where id_transaksi='"+tr.getId_transaksi()+"'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        
        return hasil;
    }
    
    
}
