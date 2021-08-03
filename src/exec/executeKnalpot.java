/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.knalpot;
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
public class executeKnalpot {
     public List<knalpot> getAllknalpot(){
        String query = "select * from knalpot";
        ConnectionManager conMan = new ConnectionManager();
        List<knalpot> lsknalpot = new ArrayList<knalpot>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                knalpot kp = new knalpot();
                kp.setId_knalpot(rs.getString("id_knalpot"));
                kp.setNama_knalpot(rs.getString("nama_knalpot"));
                kp.setHarga_knalpot(rs.getInt("harga_knalpot"));
                lsknalpot.add(kp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsknalpot;
    }
    
    public int insertData(knalpot kp){

        int hasil = 0;
        String query ="Insert into knalpot(id_knalpot, nama_knalpot, harga_knalpot)"
                +" values('"+kp.getId_knalpot()+"','"+kp.getNama_knalpot()+"',"+kp.getHarga_knalpot()
                +")";
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
    public int hapusData(String id_knalpot){
        String query = "Delete from knalpot where id_knalpot='"+ id_knalpot+"'";
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
        public int ubahData(knalpot kp){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update knalpot set nama_knalpot='"+kp.getNama_knalpot()+"', harga_knalpot="+kp.getHarga_knalpot()+
                " where id_knalpot='"+kp.getId_knalpot()+"'";
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
