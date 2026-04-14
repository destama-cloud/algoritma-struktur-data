import java.util.Scanner;

public class duties1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array kode plat
        char[] CODE = {'A','B','D','E','F','G','H','L','M','T'};

        // Array nama kota (maks 12 karakter per kota)
        String[] kotaNama = {
                "BANTEN",
                "JAKARTA",
                "BANDUNG",
                "CIREBON",
                "BOGOR",
                "PEKALONGAN",
                "SEMARANG",
                "SURABAYA",
                "MALANG",
                "TEGAL"
        };

        // Menampilkan isi array seperti tabel
        System.out.println("Kode Plat dan Nama Kota:");
        for (int i = 0; i < CODE.length; i++) {
            System.out.println(CODE[i] + " -> " + kotaNama[i]);
        }

        // Input plat nomor dari user
        System.out.print("\nMasukkan plat nomor: ");
        String plat = input.nextLine().toUpperCase();

        // Ambil huruf pertama sebagai kode kota
        char kodeInput = plat.charAt(0);

        boolean ditemukan = false;

        // Mencari kode kota
        for (int i = 0; i < CODE.length; i++) {

            if (kodeInput == CODE[i]) {

                ditemukan = true;

                System.out.println("Kota terdeteksi : " + kotaNama[i]);

                // Menghapus nama kota dari plat
                // Mengambil substring tanpa huruf pertama
                String hasil = plat.substring(1);

                System.out.println("Plat tanpa kode kota : " + hasil);
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode kota tidak ditemukan!");
        }

        input.close();
    }
}