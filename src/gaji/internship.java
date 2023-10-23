package gaji;
/**
 *
 * @author pandh
 */
public class internship extends pegawai{

       public void setlamakerja() {
        lamakerja = 200;
    }

    public void setgaji() {
        gaji = 2_000_000;
    }

    int potongan(int jam) {
        if (jam >= 200) {
            jam = 200;
        }
        setlamakerja();
        setgaji();
        int total = super.lamakerja - jam; 
        int potongan = super.gaji-(10_000*total);
        return potongan;
    }

}
