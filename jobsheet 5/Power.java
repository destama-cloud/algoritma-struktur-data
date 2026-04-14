import java.util.Scanner;

public class Power {
    // Atribut untuk baseNumber dan exponent
    int baseNumber, exponent;

    // Parameterized constructor untuk inisialisasi
    Power(int b, int e) {
        baseNumber = b;
        exponent = e;
    }

    // Metode untuk menghitung pangkat menggunakan Brute Force
    public int powerBF(int n, int e) {
        int result = 1;
        for (int i = 1; i <= e; i++) {
            result *= n;  // Mengalikan baseNumber sebanyak exponent kali
        }
        return result;
    }

    // Metode untuk menghitung pangkat menggunakan Divide and Conquer
    public int powerDC(int n, int e) {
        if (e == 0) {
            return 1;  // Basis: apapun yang dipangkatkan 0 adalah 1
        } else {
            return n * powerDC(n, e - 1);  // Rekursif mengurangi exponent
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // Meminta input dari pengguna
            System.out.print("Masukkan jumlah elemen: ");
            int elem = input.nextInt();

            Power[] p = new Power[elem];  // Membuat array objek Power

            // Meminta input untuk setiap elemen (baseNumber dan exponent)
            for (int i = 0; i < elem; i++) {
                System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
                int base = input.nextInt();
                System.out.print("Masukkan nilai exponent elemen ke-" + (i + 1) + ": ");
                int exp = input.nextInt();

                p[i] = new Power(base, exp);  // Menginisialisasi objek Power
            }

            // Menampilkan hasil perhitungan menggunakan Brute Force dan Divide and Conquer
            System.out.println("\nPOWER RESULT USING BRUTEFORCE:");
            for (Power power : p) {
                System.out.println(power.baseNumber + "^" + power.exponent + " = " + power.powerBF(power.baseNumber, power.exponent));
            }

            System.out.println("\nPOWER RESULT USING DIVIDE AND CONQUER:");
            for (Power power : p) {
                System.out.println(power.baseNumber + "^" + power.exponent + " = " + power.powerDC(power.baseNumber, power.exponent));
            }
        }
    }
} 
    

