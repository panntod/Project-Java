package TokoOnline;

import java.util.*;

public class Member extends User {
//dikelas member kita hanya bisa membeli 

    static int saldo = 0;

    static void user() {
        System.out.print("Masukkan Nama\t:");
        nama = sc.nextLine();
        System.out.print("Alamat Rumah\t:");
        alamat = sc.nextLine();
        System.out.printf("Masukkan Hp\t:");
        nomorHp = sc.nextLine();

        System.out.println("\n========Menu========");
        System.out.println("[1] Show Menu");
        System.out.println("[2] Exit");
        System.out.print("Pilihan Menu> ");
        int selectMenu = sc.nextInt();

        switch (selectMenu) {
            case 1:
                showMenu();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    static void showMenu() {
        System.out.println("\n========Menu=========");
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(String.format("[%d]%s", i + 1, listMenu.get(i)));
        }
        System.out.println("=====================\n");
        bayar();
    }

    static void bayar() {
        do {
            pilihanmenu = new String[]{"ayam mentah", "daging mentah", "nugget", "sosis", "Es cincau kemasan", "Es teh botol kemasan", "Teh tarik kemasan", "Kopi kemasan"};
            harga = new int[]{20_000, 25_000, 19_000, 18_000, 6_000, 5_000, 9_000, 3_000};

            System.out.print("Masukkan mana yang mau kamu beli [dengan angka] : ");
            int menu = sc.nextInt();
            sc.nextLine();

            System.out.print("Apakah kamu ingin membeli lagi : ");
            String yes = sc.nextLine();

            pesanan = Arrays.copyOf(pesanan, pesanan.length + 1);
            pesanan[pesanan.length - 1] = pilihanmenu[menu - 1];
            bayar += harga[menu - 1];

            if (yes.equalsIgnoreCase("tidak")) {
                System.out.println("=======================");
                System.out.print("\nTotal belanjaan kamu " + bayar + " Masukkan Saldo: ");
                saldo = sc.nextInt();

                if (saldo < bayar) {
                    System.out.println("\n================================================");
                    System.out.println("Uang Kamu Kurang.");
                    System.out.println("================================================");
                    break;
                } else if (saldo > bayar) {

                    String p = "";
                    for (String dataPesanan : pesanan) {
                        p = p + dataPesanan + ". ";
                    }

                    System.out.println("\n================================================");
                    System.out.println("Atas nama " + nama + ", Alamat " + alamat + ", Nomor Handphone " + nomorHp);
                    System.out.println("Pesanan kamu: " + p + "\nTotal Biaya\t: " + bayar + "\nSaldo Kamu\t: " + saldo + "\nKembalian\t: " + (saldo - bayar));
                    System.out.println("================================================");
                    System.exit(0);
                }
            }
        } while (true);
    }
}
