package gaji;

public class cleaningservice extends pegawai {

    public void setlamakerja() {
        lamakerja = 200;
    }

    public void setgaji() {
        gaji = 3_000_000;
    }

    int potongan(int jam) {
        if (jam >= 200) {
            jam = 200;
        }
        setlamakerja();
        setgaji();
        int total = lamakerja - jam; 
        int potongan = gaji-(15_000*total);
        return potongan;
    }
}
