package TokoOnline;

public class Karyawan extends User {
//dikelas karyawan kita bisa menambahkan, mengurangi, dan menghapus barang "Namun tidak memasukkan harga ke array"

    static void pengguna() {
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Alamat Rumah: ");
        alamat = sc.nextLine();
        System.out.print("Masukkan Nomor Handphone ");
        nomorHp = sc.nextLine();
        do {
            operator();
        } while (true);
    }

    static void operator() {

        System.out.println("\n========Menu========");
        System.out.println("[1] Show Menu");
        System.out.println("[2] Tambah Barang");
        System.out.println("[3] Ganti Barang");
        System.out.println("[4] Hapus Barang");
        System.out.println("[5]Hapus Seluruh Barang");
        System.out.println("[6] Exit");
        System.out.print("Pilih Menu> ");

        int selectMenu = sc.nextInt();

        switch (selectMenu) {
            case 1:
                showMenu();
                break;
            case 2:
                tambahBarang();
                break;
            case 3:
                gantiBarang();
                break;
            case 4:
                hapusBarang();
                break;
            case 5:
                listMenu.clear();
                break;
            case 6:
                System.out.println("Terimakasih Admin " + nama + " " + alamat + " " + nomorHp + " atas kerjanya hari ini <3");
                System.exit(0);
                break;
        }
    }

    static void showMenu() {
        System.out.println("========Daftar Menu=========");
        int menuCount = listMenu.size(); // menyimpan jumlah menu sebelum adanya penambahan
        for (int i = 0; i < menuCount; i++) { // hanya menampilkan menu sampai indeks menuCount
            System.out.println(String.format("[%d]%s", i + 1, listMenu.get(i)));
        }
    }

static void tambahBarang() {
        boolean ulang = true;
        while (ulang) {
            System.out.print("Masukkan Nama Barang: ");
            sc.nextLine();
            String benda = sc.nextLine();

            System.out.print("Masukkan Harga:");
            String price = sc.nextLine();

            String addBarang = benda + " Rp " + price;
            System.out.println("Apakah kamu ingin menambahkan " + addBarang);

            System.out.println("Apakah Kamu Ingin Menambah Lagi> ");
            String yes = sc.nextLine();
            if (yes.equalsIgnoreCase("tidak")) {
                listMenu.add(addBarang); // menambahkan elemen baru di akhir perulangan
                ulang = false;
            } else {
                listMenu.add(addBarang);
            }

        }
    }

    static void gantiBarang() {
        showMenu();

        System.out.println("Pilih nomor berapa yang akan diganti ");
        int indexBarang = sc.nextInt() - 1;

        System.out.print("Masukkan Nama Barang: ");
        sc.nextLine();
        String benda = sc.nextLine();

        System.out.print("Masukkan Harga:");
        String harga = sc.nextLine();

        String namaBaru = benda + " Rp " + harga;
        listMenu.set(indexBarang, namaBaru);
    }

    static void hapusBarang() {
        showMenu();

        System.out.println("Pilih nomor mana yang akan dihapus ");
        int deletNo = sc.nextInt();
        listMenu.remove(deletNo);

}

}

