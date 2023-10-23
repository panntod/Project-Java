package Perpus;

/**
 *
 * @author pandh
 */
public class Laporan {
     public void laporan(Buku buku) {
        int x = buku.getJmlBuku();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.printf("|%-14s | %-12s | %-4s | %-2s |\n","Nama Buku","Harga /pcs","Stok","Id");
        for (int i = 0; i < x; i++) {
            System.out.printf("|%-14s | %-12d | %-4d | %-2d |\n",buku.getNamaBuku(i) ,buku.getHarga(i) ,  buku.getStok(i) , i);
        }
    }

    public void laporan(Siswa murid) {
        int x = murid.getJmlMurid();

        System.out.println();  
        System.out.println("Tabel Member");
        System.out.println();
        System.out.printf("| %-16s | %-10s | %-6s | %-10s | %-3s|\n","Nama","Kelas","Absen","Status","Id");
        for (int i = 0; i < x; i++) {
            int id = i;
            System.out.printf("| %-16s | %-10s | %-6s | %-10s | %-3s|\n",murid.getNama(i) , murid.getKelas(i) , murid.getAbsen(i) , murid.getStatus(i) ? "Boleh":"Tidak", id) ;
        }
    }
        public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println();  
        System.out.println("Tabel Petugas");
        System.out.println();
        System.out.printf("| %-12s | %-14s |%-18s|\n","Nama","Alamat","Telepon");
        for (int i = 0; i < x; i++) {
            System.out.printf("| %-12s | %-14s |%-18s|\n", petugas.getNama(i) , petugas.getKelas(i) , petugas.getAbsen(i));
        }
    }

    public void laporanPengembalian(prosesPeminjaman pinjam, Buku buku) {
        int x = pinjam.getJmlPeminjaman();

        System.out.println();
        System.out.println("Laporan Peminjaman");
        System.out.println();
        System.out.printf("| %-12s | %-10s |\n","Nama Buku","Sisa Stok");

        int total = 0;
        for (int i = 0; i < x; i++) {
           
        }
        System.out.println("\nTotal Omset =" + total);
    }
}
