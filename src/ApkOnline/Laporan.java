package ApkOnline;

public class Laporan {

    public void laporan(Barang barang) {
        int x = barang.getJmlBarang();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.printf("|%-12s | %-4s | %-5s | %-2s |\n","Nama Barang","Stok","Harga","Id");
        for (int i = 0; i < x; i++) {
            System.out.printf("|%-12s | %-4d | %-5d | %-2d |\n",barang.getNamaBarang(i) ,  barang.getStok(i) ,  barang.getHarga(i), i);
        }
    }

    public void laporan(Member member) {
        int x = member.getJmlMember();

        System.out.println();  
        System.out.println("Tabel Member");
        System.out.println();
        System.out.printf("| %-12s | %-14s | %-14s | %-10s | %-3s|\n","Nama","Alamat","Telepon","Saldo","Id");
        for (int i = 0; i < x; i++) {
            int id = i;
            System.out.printf("| %-12s | %-14s | %-14s | %-10d | %-3s|\n",member.getNama(i) , member.getAlamat(i) , member.getTelepon(i) , member.getSaldo(i), id) ;
        }
    }
        public void laporan(Karyawan karyawan) {
        int x = karyawan.getJmlKaryawan();

        System.out.println();  
        System.out.println("Tabel Karyawan");
        System.out.println();
        System.out.printf("| %-12s | %-14s |%-18s|\n","Nama","Alamat","Telepon");
        for (int i = 0; i < x; i++) {
            System.out.printf("| %-12s | %-14s |%-18s|\n", karyawan.getNama(i) , karyawan.getAlamat(i) , karyawan.getTelepon(i));
        }
    }

    public void laporan(Transaksi transaksi, Barang barang) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.printf("| %-12s | %-4s | %-6s | %-10s |\n","Nama Barang","Qty" ,"Harga" ,"Total");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * barang.getHarga(transaksi.getIdBarang(i));
            total += jumlah;

            System.out.printf("| %-12s | %-4s | %-6s | %-10s | %-5d\n",barang.getNamaBarang(transaksi.getIdBarang(i)) , transaksi.getBanyaknya(i) , barang.getHarga(transaksi.getIdBarang(i)) , jumlah, barang.getHarga(transaksi.getIdBarang(i)));
        }
        System.out.println("\nTotal Omset =" + total);
    }
}
