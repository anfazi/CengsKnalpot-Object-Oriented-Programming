/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.pegawai;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mesin Tempur
 */
public class executePegawai {
    public List<pegawai> getAllpegawai(){
        String query = "select * from pegawai";
        ConnectionManager conMan = new ConnectionManager();
        List<pegawai> lspegawai = new ArrayList<pegawai>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                pegawai pg = new pegawai();
                pg.setNama_pegawai(rs.getString("nama_pegawai"));
                pg.setUsername(rs.getString("username"));
                pg.setPassword(rs.getString("password"));
                lspegawai.add(pg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lspegawai;
    }
    
    public int insertData(pegawai pg){

        int hasil = 0;
        String query ="Insert into pegawai(nama_pegawai, username, password)"
                +" values('"+pg.getNama_pegawai()+"','"+pg.getUsername()+"','"+pg.getPassword()
                +"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executePegawai.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    public int hapusData(String username){
        String query = "Delete from pegawai where username='"+ username+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executePegawai.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    public int ubahData(pegawai pg){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update pegawai set nama_pegawai='"+pg.getNama_pegawai()+"', password='"+pg.getPassword()+
                "' where username='"+pg.getUsername()+"'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executePegawai.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        return hasil;
    }
}
