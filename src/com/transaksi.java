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
public class transaksi {
    private String id_transaksi;
    private String tanggal_beli;
    private String nama_pembeli;
    private String barang_dibeli;
    private Integer jumlah_beli;
    private Integer harga_total;

    public transaksi() {
    }

    public transaksi(String tanggal_beli, String nama_pembeli, Integer jumlah_beli, Integer harga_total) {
        this.tanggal_beli = tanggal_beli;
        this.nama_pembeli = nama_pembeli;
        this.jumlah_beli = jumlah_beli;
        this.harga_total = harga_total;
    }

    public transaksi(String id_transaksi, String tanggal_beli, String nama_pembeli, String barang_dibeli, Integer jumlah_beli, Integer harga_total) {
        this.id_transaksi = id_transaksi;
        this.tanggal_beli = tanggal_beli;
        this.nama_pembeli = nama_pembeli;
        this.barang_dibeli = barang_dibeli;
        this.jumlah_beli = jumlah_beli;
        this.harga_total = harga_total;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getTanggal_beli() {
        return tanggal_beli;
    }

    public void setTanggal_beli(String tanggal_beli) {
        this.tanggal_beli = tanggal_beli;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getBarang_dibeli() {
        return barang_dibeli;
    }

    public void setBarang_dibeli(String barang_dibeli) {
        this.barang_dibeli = barang_dibeli;
    }

    public Integer getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(Integer jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }

    public Integer getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(Integer harga_total) {
        this.harga_total = harga_total;
    }

    @Override
    public String toString() {
        return "transaksi{" + "id_transaksi=" + id_transaksi + ", tanggal_beli=" + tanggal_beli + ", nama_pembeli=" + nama_pembeli + ", barang_dibeli=" + barang_dibeli + ", jumlah_beli=" + jumlah_beli + ", harga_total=" + harga_total + '}';
    }

    
    
}
