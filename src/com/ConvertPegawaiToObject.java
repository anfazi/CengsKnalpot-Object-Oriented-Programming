/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.executePegawai;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mesin Tempur
 */
public class ConvertPegawaiToObject {
        public String[][]getPegawai(){
        List<pegawai> mypg = new ArrayList<pegawai>();
        executePegawai epg = new executePegawai();
        mypg = epg.getAllpegawai();
        String[][] datapegawai = new String[mypg.size()][3];
        int i=0;
        for(pegawai pg : mypg){
            datapegawai[i][0] = pg.getNama_pegawai();
            datapegawai[i][1] = pg.getUsername();
            datapegawai[i][2] = pg.getPassword();
            i++;
        }
        return datapegawai;
    }
}
