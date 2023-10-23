package ApkOnline;

import java.util.*;

/**
 *
 * @author pandh
 */
public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("cokelat");
        this.stok.add(10);
        this.harga.add(5000);

        this.namaBarang.add("susu");
        this.stok.add(10);
        this.harga.add(1000);

        this.namaBarang.add("Odol");
        this.stok.add(15);
        this.harga.add(1900);

        this.namaBarang.add("Ayam");
        this.stok.add(25);
        this.harga.add(10000);

        this.namaBarang.add("Pop Mie");
        this.stok.add(30);
        this.harga.add(6000);        
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBarang) {
        return this.stok.get(idBarang);
    }

    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBarang) {
        return this.harga.get(idBarang);
    }

}
