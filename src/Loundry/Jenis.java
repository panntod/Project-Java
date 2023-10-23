/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loundry;

import java.util.*;

public class Jenis {

    private ArrayList<String> jenisLoundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public Jenis() {
        this.jenisLoundry.add("Cuci Kering");
        this.harga.add(5000);
        this.durasi.add(6);

        this.jenisLoundry.add("Cuci Basah");
        this.harga.add(4000);
        this.durasi.add(3);

        this.jenisLoundry.add("Cuci Setrika");
        this.harga.add(7000);
        this.durasi.add(12);
    }

    public int getJmlJenis() {
        return jenisLoundry.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.jenisLoundry.add(namaBarang);
    }

    public String getNamaBarang(int idLoundry) {
        return this.jenisLoundry.get(idLoundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idLoundry) {
        return this.harga.get(idLoundry);
    }

    public void setdurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getdurasi(int idLoundry) {
        return this.durasi.get(idLoundry);
    }
}

