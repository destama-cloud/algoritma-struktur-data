import java.util.Scanner;

public class array {

    // Function untuk mengubah nilai angka menjadi bobot
    public static double konversiBobot(int nilai) {

        if (nilai > 80) return 4.0;
        else if (nilai > 73) return 3.5;
        else if (nilai > 65) return 3.0;
        else if (nilai > 60) return 2.5;
        else if (nilai > 50) return 2.0;
        else if (nilai > 39) return 1.0;
        else return 0.0;
    }

    // Function untuk mengubah nilai angka menjadi huruf
    public static String konversiHuruf(int nilai) {

        if (nilai > 80) return "A";
        else if (nilai > 73) return "B+";
        else if (nilai > 65) return "B";
        else if (nilai > 60) return "C+";
        else if (nilai > 50) return "C";
        else if (nilai > 39) return "D";
        else return "E";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahMK = 7; // jumlah mata kuliah
        String[] namaMK = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 2};
        int[] nilaiAngka = new int[jumlahMK];
        double totalBobotSKS = 0;
        int totalSKS = 0;

        // Input nilai
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextInt();
        }

        System.out.println("\n==============================================================");
        System.out.printf("%-40s %-10s %-12s %-10s\n", "MK", "Nilai", "Nilai Huruf", "Bobot");
        System.out.println("==============================================================");

        // Proses perhitungan
        for (int i = 0; i < jumlahMK; i++) {

            String huruf = konversiHuruf(nilaiAngka[i]);
            double bobot = konversiBobot(nilaiAngka[i]);

            totalBobotSKS += bobot * sks[i];
            totalSKS += sks[i];

            System.out.printf("%-40s %-10d %-12s %-10.2f\n",
                    namaMK[i], nilaiAngka[i], huruf, bobot);
        }

        // Hitung IP
        double ip = totalBobotSKS / totalSKS;

        System.out.println("==============================================================");
        System.out.printf("IP Semester : %.2f\n", ip);

        input.close();
    }
}