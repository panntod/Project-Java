package UjiCobaKombo;

import java.util.*;

public class SoalLks {

    static Scanner sc = new Scanner(System.in);

    public static void Soal1() {
        System.out.print("Masukan Nilai A: ");
        int a = sc.nextInt();

        System.out.print("Masukan Nilai B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("Nilai Sama");
        }
    }

    public static void Soal2() {
        System.out.print("Masukan Nilai: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }

    public static void Soal3() {
        System.out.print("Masukan Urutan yg Ingin Dijumlahkan: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count += i;
        }
        System.out.println(count);
    }

    public static void Soal4() {
        System.out.print("Masukan Jumlah Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        String m[] = new String[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukan Bilang: ");
            int b = sc.nextInt();
            a[i] = b;
            if (a[i] % 2 == 0) {
                m[i] = "Genap";
            } else {
                m[i] = "Ganjil";
            }

        }

        for (int i = 0; i < m.length; i++) {
            System.out.print( m[i] + ", ");
        }
    }

    public static void Soal5() {
        int k = sc.nextInt();
        int[] a = new int[k];
        int n = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    n = i;
                }
            }
        }

        System.out.println(a[n]);
    }

    public static void Soal6() {
        System.out.print("Masukkan Target:");
        int k = sc.nextInt();

        int n = sc.nextInt();
        System.out.println("");

        int arr[] = new int[n];
        int lo = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    lo++;
                }
            }
        }

        if (lo == 0) {
            System.out.println("Tidak Bisa");
        } else {
            System.out.println("Bisa");
        }
    }

    public static void Soal7() {
        int lop = sc.nextInt();
        int[] arr = new int[lop];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Tidak Ada");
        } else {
            System.out.println("Ada");
        }
    }

    public static void Soal8() {
        System.out.print("Masukan Banyak: ");
        int kom = sc.nextInt();

        String[] buah = new String[kom];
        int[] kilo = new int[kom];
        int count = 0;
        int max = 0;

        for (int i = 0; i < kom; i++) {
            System.out.print("Masukan Nama Buah: ");
            sc.nextLine();
            buah[i] = sc.nextLine();

            System.out.print("Masukan Kilo: ");
            kilo[i] = sc.nextInt();
        }

        for (int j = 0; j < buah.length; j++) {
            if (kilo[j] > max) {
                max = kilo[j];
                count = j;
            }
        }

        System.out.println("Buah Terlaris: " + buah[count]);
    }

    public static void main(String[] args) {
//        Soal1();
//        Soal2();
//        Soal3();
//        Soal4();
//        Soal5();
//        Soal6();
//        Soal7();
//        Soal8();
    }
}
