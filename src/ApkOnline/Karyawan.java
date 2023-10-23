package ApkOnline;

import java.util.*;

/**
 *
 * @author pandh
 */
public class Karyawan implements User {

    public ArrayList<String> namaKaryawan = new ArrayList<String>();
    public ArrayList<String> alamat = new ArrayList<String>();
    public ArrayList<String> telepon = new ArrayList<String>();


    public Karyawan() {
        this.namaKaryawan.add("Admin");
        this.alamat.add("Bogor");
        this.telepon.add("081112223333");
        
        this.namaKaryawan.add("PanPin");
        this.alamat.add("Ponorogo");
        this.telepon.add("069696969");
    }

    public int getJmlKaryawan() {
        return this.alamat.size();
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaKaryawan.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaKaryawan.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}

