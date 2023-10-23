package gaji;

public class boss extends pegawai {

    public void setlamakerja() {
        lamakerja = 200;
    }

    public void setgaji() {
        gaji = 60_000_000;
    }

    int potongan(int jam) {
        if (jam >= 200) {
            jam = 200;
        }
        setlamakerja();
        setgaji();
        int total = lamakerja - jam; 
        int potongan = gaji-(30_000*total);
        System.out.println("Potongan "+ (gaji - potongan));
        return potongan;
    }

}
