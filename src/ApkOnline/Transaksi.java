package ApkOnline;

import java.util.*;

/**
 *
 * @author pandh
 */
public class Transaksi {

    Scanner myObj = new Scanner(System.in);
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idMember = new ArrayList<Integer>();

    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyaknya) {
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyaknya);
        barang.editStok(idBarang, barang.getStok(idBarang) - banyaknya);
    }

    public void prosesTransaksi(Member member, Transaksi transaksi, Barang barang) {

        System.out.println("\n=======Silahkan belanja=======");
        System.out.print("Masukkan ID Member: ");
        int idMember = myObj.nextInt();

        if (idMember > member.getJmlMember() - 1) {
            System.out.println("Maaf Member tidak ditemukan. \n==============================");
            System.exit(0);
        } else {
            System.out.println("Selamat datang " + member.getNama(idMember) + "\n==============================");
            System.out.println("\n========Menu=========");
        }

        while (true) {
            ArrayList<Integer> idBarang = new ArrayList<Integer>();
            ArrayList<Integer> banyak = new ArrayList<Integer>();

            System.out.print("Masukkan kode barang :");
            int kodeBarang = myObj.nextInt();

            if (kodeBarang < barang.getJmlBarang()) {
                idBarang.add(kodeBarang);
                System.out.print(barang.getNamaBarang(kodeBarang) + " sebanyak: ");
                int banyakBarang = myObj.nextInt();

                if (banyakBarang > barang.getStok(kodeBarang)) {
                    System.out.println("Maaf Stok Tidak Memenuhi");
                    System.out.println("=====================");
                    break;
                }
                transaksi.setTransaksi(barang, idMember, kodeBarang, banyakBarang);
                banyak.add(banyakBarang);
            } else {
                System.out.println("Tidak barang dengan kode tersebut.\n=====================");
                System.exit(0);
            }

            System.out.print("Apakah Kamu Ingin Membeli Lagi (Y/N): ");
            String no = myObj.next();
           
            if (no.equalsIgnoreCase("n")) {
                System.out.println("\n===========Struk===========");
                System.out.println("Transaksi belanja " + member.getNama(idMember) + " sebagai berikut:");
                System.out.printf("| %-12s | %-4s | %-6s | %-10s |\n", "Nama Barang", "Qty ", "Harga", "Total");

                int total = 0;
                for (int i = 0; i < transaksi.getJmlTransaksi(); i++) {
                    int jumlah = transaksi.getBanyaknya(i) * barang.getHarga(transaksi.getIdBarang(i));
                    total += jumlah;

                    System.out.printf("| %-12s | %-4s | %-6s | %-10s |\n", barang.getNamaBarang(transaksi.getIdBarang(i)), transaksi.getBanyaknya(i), barang.getHarga(transaksi.getIdBarang(i)), jumlah);
                }

                System.out.println("Total Belanja : " + total);
                member.editSaldo(idMember, member.getSaldo(idMember) - total);
                System.out.println("Sisa saldo kamu: " + member.getSaldo(idMember) + "\n===========================");
                break;
            }
        }
    }

    public void kerjaKaryawan(Karyawan karyawan, Member member, Barang barang) {

        System.out.println("\n==========Selamat Datang==========");
        
        while(true){
        System.out.print("Ingin Menambahkan apa (Member/Karyawan/Barang) : ");
        String pilihan = myObj.next();

        switch (pilihan) {
            case "member":
                System.out.print("Masukkan Nama Member: ");
                myObj.nextLine();
                String name = myObj.nextLine();
                member.setNama(name);

                System.out.print("Masukkan Alamat Member: ");
                String alamat = myObj.nextLine();
                member.setAlamat(alamat);

                System.out.print("Masukkan Nomor Hp Member: ");
                String noHp = myObj.nextLine();
                member.setTelepon(noHp);

                System.out.print("Masukkan Saldo Member: ");
                int saldo = myObj.nextInt();
                member.setSaldo(saldo);

                break;
            case "karyawan":
                System.out.print("Masukkan Nama Karyawan: ");
                myObj.nextLine();
                String nama = myObj.nextLine();
                karyawan.namaKaryawan.add(nama);

                System.out.print("Masukkan Alamat Karyawan: ");
                String addres = myObj.nextLine();
                karyawan.alamat.add(addres);

                System.out.print("Masukkan Telepon Karyawan: ");
                String number = myObj.nextLine();
                karyawan.telepon.add(number);

                break;
            case "barang":
                System.out.println("Masukkan Nama Barang:");
                myObj.nextLine();
                String namaBrg = myObj.nextLine();
                barang.setNamaBarang(namaBrg);

                System.out.println("Masukkan Stok Barang: ");
                int stok = myObj.nextInt();
                barang.setStok(stok);

                System.out.println("Masukkan Harga Barang: ");
                int harga = myObj.nextInt();
                barang.setHarga(harga);

                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
                System.out.println("==================================");
                System.exit(0);
        }
        
            System.out.print("\nApakah Kamu Ingin Menambahkan Lagi (Y/N): ");
            String yes = myObj.next();
            if(yes.equalsIgnoreCase("n")){
                break;
            }
    }


    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idMember.get(id);
    }

    public int getJmlTransaksi() {
        return this.idMember.size();
    }

}
