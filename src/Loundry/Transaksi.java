package Loundry;

import java.util.*;

public class Transaksi {

    Scanner myObj = new Scanner(System.in);

    private ArrayList<Integer> idLoundry = new ArrayList<Integer>();
    private ArrayList<Integer> idPembeli = new ArrayList<Integer>();
    private ArrayList<Integer> lama = new ArrayList<Integer>();

    public void setTransaksi(Jenis jenis, int idPembeli, int idLoundry, int lama) {
        this.idPembeli.add(idPembeli);
        this.idLoundry.add(idLoundry);
        this.lama.add(lama);
    }

    public void prosesTransaksi(Pembeli pembeli, Transaksi transaksi, Jenis jenis) {
        System.out.println("\n=======Selamat datang=======");
        System.out.print("Masukkan ID Pembeli: ");
        int idPembeli = myObj.nextInt();

        if (idPembeli > pembeli.getJmlPembeli() - 1) {
            System.out.println("Kamu Salah Memasukkan ID");
            System.exit(0);
        } else {
            System.out.println("Silahkan " + pembeli.getNama(idPembeli) + " Selamat Me-Loundry");
        }

        while (true) {
            ArrayList<Integer> idLoundry = new ArrayList<Integer>();
            ArrayList<Integer> lama = new ArrayList<Integer>();

            System.out.print("Masukkan Kode Loundry: ");
            int kodeLoundry = myObj.nextInt();

            if (kodeLoundry < jenis.getJmlJenis()) {
                idLoundry.add(kodeLoundry);
                System.out.print(jenis.getNamaBarang(kodeLoundry) + " berapa Kg: ");
                int lamaLoundry = myObj.nextInt();

                lama.add(lamaLoundry);
                transaksi.setTransaksi(jenis, idPembeli, kodeLoundry, lamaLoundry);

            } else {
                System.out.println("Tidak ada loundry dengan kode tersebut");
                break;
            }

            System.out.print("Apakah Kamu ingin me-Loundry lagi (y/n): ");
            String yn = myObj.next();

            if (yn.equalsIgnoreCase("n")) {
                System.out.println("\n============Struk============");
                System.out.println("Transaksi Belanja " + pembeli.getNama(idPembeli) + " Sebagai Berikut: ");
                System.out.printf("| %-14s | %-4s | %-12s |\n", "Jenis Loundry", "lama", "Total");

                int total = 0;
                for (int i = 0; i < transaksi.getJmlTransaksi(); i++) {
                    int jumlah = transaksi.getlama(i) * jenis.getHarga(transaksi.getIdLoundry(i));
                    total += jumlah;

                    System.out.printf("| %-14s | %-4d | %-12d |\n", jenis.getNamaBarang(transaksi.getIdLoundry(i)), transaksi.getlama(i), jumlah);
                }

                System.out.println("Total Belanja: " + total);
                pembeli.editSaldo(idPembeli, pembeli.getSaldo(idPembeli) - total);
                System.out.println("Sisa Saldo Kamu: " + pembeli.getSaldo(idPembeli));
                break;
            }
        }
    }

    public int getIdLoundry(int id) {
        return this.idLoundry.get(id);
    }

    public int getlama(int id) {
        return this.lama.get(id);
    }

    public int getIdMember(int id) {
        return this.idPembeli.get(id);
    }

    public int getJmlTransaksi() {
        return this.idPembeli.size();
    }
}
