package Perpus;

import java.util.ArrayList;

public class Petugas implements User{
    
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamatPetugas = new ArrayList<String>();
    private ArrayList<String> nomorHp = new ArrayList<String>();

    public Petugas() {
        this.namaPetugas.add("admin");
        this.alamatPetugas.add("MALANG");
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
    public void setKelas(String alamatPetugas) {
        this.alamatPetugas.add(alamatPetugas);
    }

    @Override
    public String getKelas(int idPetugas) {
        return this.alamatPetugas.get(idPetugas);
    }

    @Override
    public void setAbsen(String nomorHp) {
        this.nomorHp.add(nomorHp);
    }

    @Override
    public String getAbsen(int idPetugas) {
        return this.nomorHp.get(idPetugas);
    }

    public int getJmlPetugas() {
        return namaPetugas.size();
    }
}

    

