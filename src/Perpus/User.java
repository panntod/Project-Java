package Perpus;
public interface User {
  
    
    public void setNama(String nama);
    public void setKelas(String kelas);
    public void setAbsen(String absen);

    public String getNama(int id);
    public String getKelas(int id);
    public String getAbsen(int id);
    
}
abstract class Userr {
  
    
    public abstract void setNama(String nama);
    public abstract void setKelas(String kelas);
    public abstract void setAbsen(String absen);

    public abstract String getNama(int id);
    public abstract String getKelas(int id);
    public abstract String getAbsen(int id);
    
}
