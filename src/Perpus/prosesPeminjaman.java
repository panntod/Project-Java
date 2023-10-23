package Perpus;

import java.util.*;

/**
 *
 * @author pandh
 */
public class prosesPeminjaman {

    Scanner myObj = new Scanner(System.in);

    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> idMurid = new ArrayList<Integer>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();

    public void setTransaksi(Buku buku, int idMurid, int idBuku, int stok) {
        this.idMurid.add(idMurid);
        this.idBuku.add(idBuku);
        this.stok.add(stok);
    }

    public void prosesPeminjaman(Siswa murid, prosesPeminjaman pinjam, Buku buku) {

      while(true){  
        
        System.out.println("\nSelamat Datang diPerpustakaan");
        System.out.print("Masukkan Id Siswa:");
        int idMurid = myObj.nextInt();

        if (idMurid > murid.getJmlMurid() - 1) {
            System.out.println("Kamu Salah Memasukkan ID");
            break;
        } else {
            System.out.println("Silahkan " + murid.getNama(idMurid) + " Selemat Memiinjam  Buku");
        }

        if (!murid.getStatus(idMurid)) {

            System.out.print("Apakah Kamu ingin mengembalikan buku (y/n): ");
            String yn = myObj.next();

            if (yn.equalsIgnoreCase("n")) {
                System.out.println("Terimakasih Sudah Berkunjung");
                break;

            } else if (yn.equalsIgnoreCase("y")) {
                ArrayList<Integer> jumlah = new ArrayList<Integer>();
                ArrayList<Integer> bukuu = new ArrayList<Integer>();

                System.out.print("Masukkan ID buku yang mau di Kembalikan: ");
                int kodeBuku = myObj.nextInt();

                if (kodeBuku < buku.getJmlBuku()) {
                    bukuu.add(kodeBuku);
                    System.out.print(buku.getNamaBuku(kodeBuku) + " Berapa: ");
                    int stock = myObj.nextInt();
                    buku.editStok(kodeBuku, buku.getStok(kodeBuku) + stock);
                    murid.editStatus(idMurid, true);

                    jumlah.add(stock);
                    pinjam.setTransaksi(buku, idMurid, kodeBuku, stock);
                } else {
                    System.out.println("Tidak ada Buku dengan kode tersebut");
                    break;
                }

            }
        } else if (murid.getStatus(idMurid)) {

            ArrayList<Integer> jumlah = new ArrayList<Integer>();
            ArrayList<Integer> bukuu = new ArrayList<Integer>();

            System.out.print("Masukkan ID buku yang mau di Pinjam: ");
            int kodeBuku = myObj.nextInt();

            if (kodeBuku < buku.getJmlBuku()) {
                bukuu.add(kodeBuku);
                System.out.print(buku.getNamaBuku(kodeBuku) + " Berapa: ");
                int stock = myObj.nextInt();
                
                if (stock > buku.getStok(kodeBuku)) {
                    System.out.println("Stok tidak memenuhi.");
                    break;
                }
                
                buku.editStok(kodeBuku, buku.getStok(kodeBuku) - stock);
                murid.editStatus(idMurid, false);

                jumlah.add(stock);
                pinjam.setTransaksi(buku, idMurid, kodeBuku, stock);

            } else {
                System.out.println("Tidak ada Buku dengan kode tersebut");
                break;
            }

        } else {
            System.out.println("Maaf Ada Kesalahan");
            break;
        }

        /*
        System.out.println("\n===========Struk===========");
        System.out.println("Transaksi Peminjaman " + murid.getNama(idMurid) + " sebagai berikut:");
        System.out.printf("| %-12s | %-4s | \n", "Nama buku", "Qty");

        for (int i = 0; i < pinjam.getJmlPeminjaman(); i++) {
            System.out.printf("| %-12s | %-4s |\n", buku.getNamaBuku(pinjam.getIdBuku(i)), pinjam.stok(i));
        }
        */

            System.out.print("\nCek Status Terbaru ");
            break;

    }
        
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int stok(int id) {
        return this.stok.get(id);
    }

    public int getIdMember(int id) {
        return this.idMurid.get(id);
    }

    public int getJmlPeminjaman() {
        return this.idMurid.size();
    }

}
