/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import exec.executeTransaksi;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mesin Tempur
 */
public class ConvertTransaksiToObject {
public String[][]gettransaksi(){
        List<transaksi> mytr = new ArrayList<transaksi>();
        executeTransaksi etr = new executeTransaksi();
        mytr = etr.getAlltransaksi();
        String[][] datatransaksi = new String[mytr.size()][6];
        int i=0;
        for(transaksi tr : mytr){
            datatransaksi[i][0] = tr.getId_transaksi();
            datatransaksi[i][1] = tr.getTanggal_beli();
            datatransaksi[i][2] = tr.getNama_pembeli();
            datatransaksi[i][3] = tr.getBarang_dibeli();
            datatransaksi[i][4] = ""+tr.getJumlah_beli();
            datatransaksi[i][5] = ""+tr.getHarga_total();
            i++;
        }
        return datatransaksi;
    }
}
