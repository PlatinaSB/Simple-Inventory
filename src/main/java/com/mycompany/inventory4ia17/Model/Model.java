/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory4ia17.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Platina Setia Budi
 */
@Entity
@Table(name = "inventory")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "kodebarang", nullable = false, length = 25)
    private String kodebarang;

    @Column(name = "namabarang", nullable = false, length = 100)
    private String namabarang;

    @Column(name = "jumlah", nullable = false)
    private int jumlah;

    @Column(name = "lokasi", nullable = false, length = 50)
    private String lokasi;

    public Model() {
    }

    public Model(int id, String kodebarang, String namabarang, int jumlah, String lokasi) {
        this.id = id;
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.jumlah = jumlah;
        this.lokasi = lokasi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

}
