import java.util.Scanner;

public class electionpracticum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf = "", keterangan = "", status;

        System.out.println("Program Menghitung Nilai Akhir");

        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis  : ");
        kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS   : ");
        uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS   : ");
        uas = input.nextDouble();

        // Validasi nilai (0 - 100)
        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("\nNilai tidak valid!");
            input.close();
            return;
        }

        // Hitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) +
                     (0.3 * uts) + (0.3 * uas);

        // Konversi nilai huruf
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            keterangan = "Lebih dari Baik";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            keterangan = "Baik";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            keterangan = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            keterangan = "Cukup";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            keterangan = "Kurang";
        } else {
            nilaiHuruf = "E";
            keterangan = "Gagal";
        }

        // Status kelulusan
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {
            status = "PASS";
        } else {
            status = "NOT PASS";
        }

        // Output hasil
        System.out.println("\nNilai Akhir  : " + nilaiAkhir);
        System.out.println("Nilai Huruf  : " + nilaiHuruf);
        System.out.println("Keterangan   : " + keterangan);
        System.out.println("Status       : " + status);

        input.close();
    }
}