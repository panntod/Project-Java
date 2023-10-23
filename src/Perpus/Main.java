package Perpus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Buku b = new Buku();
        Siswa m = new Siswa();
        Petugas p = new Petugas();
        Laporan l = new Laporan();
        
        boolean isRunning = true;

        prosesPeminjaman pp = new prosesPeminjaman();

        l.laporan(b);
        l.laporan(m);
        l.laporan(p);

        while (isRunning) {
            pp.prosesPeminjaman(m, pp, b);
            System.out.println("");
            l.laporan(b);
            l.laporan(m);
            
            System.out.print("\nApakah Kamu ingin Logout (y/n) : ");
            String yn = myObj.next();
            
            if (yn.equals("y")) {
                isRunning = false;
                break;
            }
        }
    }
}
