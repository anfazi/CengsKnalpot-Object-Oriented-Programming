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
public class admin {
    private String nama_admin;
    private String username;
    private String password;

    public admin() {
    }

    public admin(String nama_admin, String password) {
        this.nama_admin = nama_admin;
        this.password = password;
    }

    public admin(String nama_admin, String username, String password) {
        this.nama_admin = nama_admin;
        this.username = username;
        this.password = password;
    }

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
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
        return "admin{" + "nama_admin=" + nama_admin + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
}
