package Loundry;

import java.util.*;

public class Pembeli implements User {

    private ArrayList<String> namaPembeli = new ArrayList<String>();
    private ArrayList<String> alamatPembeli = new ArrayList<String>();
    private ArrayList<String> nomorHp = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Pembeli() {
        this.namaPembeli.add("Pandhu");
        this.alamatPembeli.add("Ponorogo");
        this.nomorHp.add("0878675553");
        this.saldo.add(1000000);
        
        this.namaPembeli.add("Dharma");
        this.alamatPembeli.add("Ponorogo");
        this.nomorHp.add("0878675553");
        this.saldo.add(1000000);
        
        
        this.namaPembeli.add("Xu Jiang Xie");
        this.alamatPembeli.add("Kepanjen");
        this.nomorHp.add("0878664346");
        this.saldo.add(2000000);
    }

    @Override
    public void setNama(String namaPembeli) {
        this.namaPembeli.add(namaPembeli);
    }

    @Override
    public String getNama(int idPembeli) {
        return this.namaPembeli.get(idPembeli);
    }

    @Override
    public void setAlamat(String alamatPembeli) {
        this.alamatPembeli.add(alamatPembeli);
    }

    @Override
    public String getAlamat(int idPembeli) {
        return this.alamatPembeli.get(idPembeli);
    }

    @Override
    public void setNomorHp(String nomorHp) {
        this.nomorHp.add(nomorHp);
    }

    @Override
    public String getNomorHp(int idPembeli) {
        return this.nomorHp.get(idPembeli);
    }

    public void setSaldo(int Saldo) {
        this.saldo.add(Saldo);
    }

    public int getSaldo(int idPembeli) {
        return this.saldo.get(idPembeli);
    }

    public void editSaldo(int idPembeli, int saldo) {
        this.saldo.set(idPembeli, saldo);
    }

    public int getJmlPembeli() {
        return this.saldo.size();
    }
}
