package Perpus;

import java.util.ArrayList;

public class Buku {

    private ArrayList<String> jenisBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.jenisBuku.add("Novel");
        this.stok.add(30);
        this.harga.add(90000);

        this.jenisBuku.add("Cerita Rakyat");
        this.stok.add(50);
        this.harga.add(45000);

        this.jenisBuku.add("Pelajaran");
        this.stok.add(70);
        this.harga.add(70000);
        
        this.jenisBuku.add("Ensiklopedia");
        this.stok.add(45);
        this.harga.add(130000);
    }

    public int getJmlBuku() {
        return jenisBuku.size();
    }

    public void setNamaBuku(String namaBarang) {
        this.jenisBuku.add(namaBarang);
    }

    public String getNamaBuku(int idBuku) {
        return this.jenisBuku.get(idBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }
    
    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
    
    public void editStok(int idBuku, int jumlah){
        this.stok.set(idBuku, jumlah);
    }
}
