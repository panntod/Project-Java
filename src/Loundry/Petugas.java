package Loundry;

import java.util.*;

public class Petugas extends Userr {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamatPetugas = new ArrayList<String>();
    private ArrayList<String> nomorHp = new ArrayList<String>();

    public Petugas() {
        this.namaPetugas.add("admin");
        this.alamatPetugas.add("Ponorogo");
        this.nomorHp.add("0878675553");
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public void setAlamat(String alamatPetugas) {
        this.alamatPetugas.add(alamatPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamatPetugas.get(idPetugas);
    }

    @Override
    public void setNomorHp(String nomorHp) {
        this.nomorHp.add(nomorHp);
    }

    @Override
    public String getNomorHp(int idPetugas) {
        return this.nomorHp.get(idPetugas);
    }

    public int getJmlPetugas() {
        return namaPetugas.size();
    }
}
