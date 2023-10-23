package gaji;
import java.util.Scanner;

public class pegawai {

    public final static Scanner sc = new Scanner(System.in);
    int lamakerja = 0, gaji = 0;
    
    void nama() {
        System.out.print("Masukan Nama ");
        String nama = sc.nextLine();
    }

    void nip() {
        System.out.print("Masukan Nip: ");
        int nip = sc.nextInt();
    }
    
    public static void fungsi(){
        System.out.print("Masukkan Lama Kerja ");
        int jam = sc.nextInt();
        System.out.print("Masukkan Jabatan ");
        String jabatan = sc.next();
        if (jabatan.equalsIgnoreCase("Boss")) {
            boss ab = new boss();
            System.out.println("Gaji: "+ab.potongan(jam));
        }else if (jabatan.equalsIgnoreCase("manager")) {
            manager ab = new manager();
            System.out.println("Gaji: "+ab.potongan(jam));
        }else if (jabatan.equalsIgnoreCase("cleaningservice")) {
            cleaningservice ab = new cleaningservice();
            System.out.println("Gaji: "+ab.potongan(jam));
        }else{
            System.out.println(jabatan+" salah memasukan pekerjaan");
        }
    }
}


