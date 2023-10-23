package Perpus;

import java.util.ArrayList;

public class Siswa extends Userr {

    private ArrayList<String> namaMurid = new ArrayList<String>();
    private ArrayList<String> kelas = new ArrayList<String>();
    private ArrayList<String> absen = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {
        this.namaMurid.add("Asfina Andini");
        this.kelas.add("X Rpl 3");
        this.absen.add("6");
        this.status.add(true);

        this.namaMurid.add("Pandhu");
        this.kelas.add("X Rpl 3");
        this.absen.add("32");
        this.status.add(false);
    }

    @Override
    public void setNama(String namaMurid) {
        this.namaMurid.add(namaMurid);
    }

    @Override
    public String getNama(int idMurid) {
        return this.namaMurid.get(idMurid);
    }

    @Override
    public void setKelas(String kelasMurid) {
        this.kelas.add(kelasMurid);
    }

    @Override
    public String getKelas(int idMurid) {
        return this.kelas.get(idMurid);
    }

    @Override
    public void setAbsen(String absen) {
        this.absen.add(absen);
    }

    @Override
    public String getAbsen(int idMurid) {
        return this.absen.get(idMurid);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public boolean getStatus(int idMurid) {
        return this.status.get(idMurid);
    }

    public void editStatus(int idMurid, boolean status) {
        this.status.set(idMurid, status);
    }

    public int getJmlMurid() {
        return this.namaMurid.size();
    }
   
}
