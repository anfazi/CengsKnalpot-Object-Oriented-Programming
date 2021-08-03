/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Mesin Tempur
 */
public class knalpot {
   private String id_knalpot;
   private String nama_knalpot;
   private Integer harga_knalpot;

    public knalpot() {
    }
    
    public knalpot(String nama_knalpot, Integer harga_knalpot) {
        this.nama_knalpot = nama_knalpot;
        this.harga_knalpot = harga_knalpot;
    }

    public knalpot(String id_knalpot, String nama_knalpot, Integer harga_knalpot) {
        this.id_knalpot = id_knalpot;
        this.nama_knalpot = nama_knalpot;
        this.harga_knalpot = harga_knalpot;
    }

    public String getId_knalpot() {
        return id_knalpot;
    }

    public void setId_knalpot(String id_knalpot) {
        this.id_knalpot = id_knalpot;
    }

    public String getNama_knalpot() {
        return nama_knalpot;
    }

    public void setNama_knalpot(String nama_knalpot) {
        this.nama_knalpot = nama_knalpot;
    }

    public Integer getHarga_knalpot() {
        return harga_knalpot;
    }

    public void setHarga_knalpot(Integer harga_knalpot) {
        this.harga_knalpot = harga_knalpot;
    }

    @Override
    public String toString() {
        return "knalpot{" + "id_knalpot=" + id_knalpot + ", nama_knalpot=" + nama_knalpot + ", harga_knalpot=" + harga_knalpot + '}';
    }
   
    
    
}
