import java.util.Scanner;

public class Sum {
    double[] profits;

    // Konstruktor untuk menginisialisasi jumlah bulan dan array profits
    Sum(int el) {
        profits = new double[el];
    }

    // Metode Brute Force untuk menghitung total
    public double totalBF() {
        double total = 0;
        for (int i = 0; i < profits.length; i++) {
            total += profits[i];  // Menjumlahkan seluruh nilai dalam array
        }
        return total;
    }

    // Metode Divide and Conquer untuk menghitung total
    public double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];  // Basis: hanya satu elemen
        } else {
            int mid = (l + r) / 2;
            double leftSum = totalDC(arr, l, mid);  // Hitung bagian kiri
            double rightSum = totalDC(arr, mid + 1, r);  // Hitung bagian kanan
            return leftSum + rightSum;  // Gabungkan hasil
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // Meminta input jumlah bulan
            System.out.print("Masukkan jumlah elemen: ");
            int el = input.nextInt();
            
            Sum sm = new Sum(el);
            
            // Meminta input keuntungan setiap bulan
            for (int i = 0; i < el; i++) {
                System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
                sm.profits[i] = input.nextDouble();
            }

            // Menghitung total menggunakan Brute Force
            System.out.println("Profit total menggunakan BF: " + sm.totalBF());

            // Menghitung total menggunakan Divide and Conquer
            System.out.println("Profit total menggunakan DC: " + sm.totalDC(sm.profits, 0, el - 1));
        } finally {
            input.close();
        }
    }
} 
    

