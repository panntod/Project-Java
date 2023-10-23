package ApkOnline;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transaksi t = new Transaksi();
        Member m = new Member();
        Laporan l = new Laporan();
        Barang b = new Barang();
        Karyawan k = new Karyawan();

        l.laporan(b);
        l.laporan(m);
        l.laporan(k);

        System.out.println("========================================");
        System.out.print("\nKamu Akan Login Sebagai (Karyawan/Member): ");
        String pilih = sc.next();

        if (pilih.equalsIgnoreCase("Member")) {
            t.prosesTransaksi(m, t, b);
            l.laporan(t, b);

            System.out.println("\n=======Sisa Barang Di Toko=======");
            l.laporan(b);
            System.out.println("========================================");
        } else if (pilih.equalsIgnoreCase("Karyawan")) {
            t.kerjaKaryawan(k, m, b);

            System.out.println("\n============Laporan Terbaru============");
            l.laporan(b);
            l.laporan(k);
            l.laporan(m);
            System.out.println("========================================");
        } else {
            System.out.println("Kamu salah login!");
            System.out.println("\n========================================");
            System.exit(0);
        }

    }

}
