package Loundry;
public class Laporan {

    public void laporanA(Jenis jenis) {
        int x = jenis.getJmlJenis();

        System.out.println();
        System.out.println("Tabel Jenis");
        System.out.println();
        System.out.printf("|%-12s | %-5s | %-2s|\n", "Nama Barang", "Harga", "Id");
        for (int i = 0; i < x; i++) {
            System.out.printf("|%-12s | %-5s | %-2s|\n", jenis.getNamaBarang(i), jenis.getHarga(i), i);
        }
    }

    public void laporanB(Pembeli member) {
        int x = member.getJmlPembeli();

        System.out.println();
        System.out.println("Tabel Member");
        System.out.println();
        System.out.printf("| %-12s | %-14s | %-14s | %-10s | %-3s|\n", "Nama", "Alamat", "Telepon", "Saldo", "Id");
        for (int i = 0; i < x; i++) {
            int id = i;
            System.out.printf("| %-12s | %-14s | %-14s | %-10d | %-3s|\n", member.getNama(i), member.getAlamat(i), member.getNomorHp(i), member.getSaldo(i), id);
        }
    }

    public void laporanC(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println();
        System.out.println("Tabel Karyawan");
        System.out.println();
        System.out.printf("| %-12s | %-14s |%-18s|\n", "Nama", "Alamat", "Telepon");
        for (int i = 0; i < x; i++) {
            System.out.printf("| %-12s | %-14s |%-18s|\n", petugas.getNama(i), petugas.getAlamat(i), petugas.getNomorHp(i));
        }
    }

    public void laporanD(Transaksi transaksi, Jenis jenis) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.printf("| %-14s | %-6s | %-2s |\n", "Jenis Loundry", "Harga", "Id");

        for (int i = 0; i < x; i++) {
            System.out.printf("| %-14s | %-6s | %-2s |\n", jenis.getNamaBarang(transaksi.getIdLoundry(i)), jenis.getHarga(transaksi.getIdLoundry(i)), i);
        }
    }
}
