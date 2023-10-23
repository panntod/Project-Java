package Loundry;

public interface User {

    public void setNama(String nama);

    public void setAlamat(String alamat);

    public void setNomorHp(String noHp);

    public String getNama(int id);

    public String getAlamat(int id);

    public String getNomorHp(int id);
}

abstract class Userr {

    public abstract void setNama(String nama);

    public abstract void setAlamat(String alamat);

    public abstract void setNomorHp(String noHp);

    public abstract String getNama(int id);

    public abstract String getAlamat(int id);

    public abstract String getNomorHp(int id);
}


