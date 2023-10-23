package TokoOnline;

import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sebagai Apa Kamu Disini> (Member/Karyawan)");
        String orang = sc.nextLine();
        if (orang.equalsIgnoreCase("member")) {
            Member.user();
        } else if (orang.equalsIgnoreCase("karyawan")) {
            Karyawan.pengguna();
        }else{
            System.out.println("Kamu salah Memasukan \nTidak ada pekerjaan "+orang);
        }
    }
}
