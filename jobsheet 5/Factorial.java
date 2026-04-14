import java.util.Scanner;

public class Factorial {

    // Brute Force Method
    public int faktorialBF(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;  // Mengalikan faktor satu per satu
        }
        return facto;
    }
    
    // Divide and Conquer Method
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;  // Base case: faktorial 1 = 1
        } else {
            int facto = n * faktorialDC(n - 1);  // Rekursif
            return facto;
        }
    }

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        try (Scanner input = new Scanner(System.in)) {
            // Meminta input angka dari pengguna
            System.out.print("Input a number: ");
            int num = input.nextInt();

            // Membuat objek Factorial untuk menghitung faktorial
            Factorial fk = new Factorial();

            // Menghitung faktorial dengan Brute Force
            System.out.println("The factorial of " + num + " using BF: " + fk.faktorialBF(num));

            // Menghitung faktorial dengan Divide and Conquer
            System.out.println("The factorial of " + num + " using DC: " + fk.faktorialDC(num));
        }
    }
}
