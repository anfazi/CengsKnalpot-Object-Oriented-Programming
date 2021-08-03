/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import exec.executeAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mesin Tempur
 */
public class ConvertAdminToObject {
    public String[][]getAdmin(){
        List<admin> myad = new ArrayList<admin>();
        executeAdmin ead = new executeAdmin();
        myad = ead.getAlladmin();
        String[][] dataadmin = new String[myad.size()][3];
        int i=0;
        for(admin ad : myad){
            dataadmin[i][0] = ad.getNama_admin();
            dataadmin[i][1] = ad.getUsername();
            dataadmin[i][2] = ad.getPassword();
            i++;
        }
        return dataadmin;
    }
    
    
    
}
