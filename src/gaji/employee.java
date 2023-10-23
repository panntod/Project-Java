package gaji;
public class employee extends pegawai {
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
        int total = super.lamakerja - jam; 
        int potongan = super.gaji-(15_000*total);
        return potongan;
    }
}
