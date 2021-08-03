/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.admin;
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
public class executeAdmin {
     public List<admin> getAlladmin(){
        String query = "select * from admin";
        ConnectionManager conMan = new ConnectionManager();
        List<admin> lsadmin = new ArrayList<admin>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                admin ad = new admin();
                ad.setNama_admin(rs.getString("nama_admin"));
                ad.setUsername(rs.getString("username"));
                ad.setPassword(rs.getString("password"));
                lsadmin.add(ad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(executeKnalpot.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsadmin;
    }
     
    public int insertData(admin ad){

        int hasil = 0;
        String query ="Insert into admin(nama_admin, username, password)"
                +" values('"+ad.getNama_admin()+"','"+ad.getUsername()+"','"+ad.getPassword()
                +"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executeAdmin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
    
     public int hapusData(String username){
        String query = "Delete from admin where username='"+ username+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executeAdmin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
     
     public int ubahData(admin ad){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "Update admin set nama_admin='"+ad.getNama_admin()+"', password='"+ad.getPassword()+
                "' where username='"+ad.getUsername()+"'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(executeAdmin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        
        return hasil;
    }
  
    

 
            

}

