package Loundry;

public class Main {

    public static void main(String[] args) {
        Transaksi t = new Transaksi();
        Pembeli m = new Pembeli();
        Laporan l = new Laporan();
        Petugas k = new Petugas();
        Jenis b = new Jenis();


        l.laporanA(b);
        l.laporanB(m);
        l.laporanC(k);

        t.prosesTransaksi(m, t, b);
    }
  
}
