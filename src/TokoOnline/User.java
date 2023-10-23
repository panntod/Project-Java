package TokoOnline;

import java.util.*;

public class User {

    static Scanner sc = new Scanner(System.in);
    static String nama, alamat, nomorHp, pilihanmenu[] = {}, pesanan[] = {};
    static int bayar,  harga[] = {};
    static ArrayList listMenu = new ArrayList()
        {{
            add("Ayam Mentah \t : Rp 20.000");
            add("Daging Mentah\t : Rp 25.000");
            add("Nugget\t\t : Rp 19.000");
            add("Sosis\t\t : Rp 18.000");
            add("Es Cincau kemasan \t : Rp 6.000");
            add("Es Teh Botol\t : Rp 5.000");
            add("Teh Tarik kemasan\t : Rp 9.000");
            add("Kopi Kemasan\t : Rp 3.000");
        }};
}

