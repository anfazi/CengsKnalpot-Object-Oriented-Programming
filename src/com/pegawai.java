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
public class pegawai {
    private String nama_pegawai;
    private String username;
    private String password;

    public pegawai() {
    }

    public pegawai(String nama_pegawai, String password) {
        this.nama_pegawai = nama_pegawai;
        this.password = password;
    }

    public pegawai(String nama_pegawai, String username, String password) {
        this.nama_pegawai = nama_pegawai;
        this.username = username;
        this.password = password;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "pegawai{" + "nama_pegawai=" + nama_pegawai + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
}
