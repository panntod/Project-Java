package gaji;

import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        pegawai pegawai = new pegawai();
        
        pegawai.nama();
        pegawai.nip();
        pegawai.fungsi();
    }
}
