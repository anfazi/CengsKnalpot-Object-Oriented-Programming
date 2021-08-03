/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import exec.executeKnalpot;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mesin Tempur
 */
public class ConvertKnalpotToObject {
    public String[][]getknalpot(){
        List<knalpot> mykp = new ArrayList<knalpot>();
        executeKnalpot ekp = new executeKnalpot();
        mykp = ekp.getAllknalpot();
        String[][] dataknalpot = new String[mykp.size()][3];
        int i=0;
        for(knalpot kp : mykp){
            dataknalpot[i][0] = kp.getId_knalpot();
            dataknalpot[i][1] = kp.getNama_knalpot();
            dataknalpot[i][2] = ""+kp.getHarga_knalpot();
            i++;
        }
        return dataknalpot;
    }
}
