package gaji;

public class manager extends pegawai{
public void setlamakerja(){
        lamakerja = 250;
    }
    
    public void setgaji(){
        gaji = 50_000_000;
    }

    int potongan(int jam) {
        if (jam >= 250) {
            jam = 250;
        }
        setlamakerja();
        setgaji();
        int total = lamakerja - jam; 
        int potongan = gaji-(20_000*total);
        return potongan;
    }

}
