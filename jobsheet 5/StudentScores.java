import java.util.Scanner;

public class StudentScores {

    // Fungsi Divide and Conquer buat nyari nilai Midterm Score tertinggi (UTS)
    public static int findMaxUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];  // Basis, jika udah ketemu angka terakhir, langsung return
        }
        
        // Ini bagian bagi dua, tengah-tengah array
        int mid = (left + right) / 2;
        
        // Rekursi, bagi jadi dua bagian
        int leftMax = findMaxUTS(arr, left, mid);  // Cari di sebelah kiri
        int rightMax = findMaxUTS(arr, mid + 1, right);  // Cari di sebelah kanan
        
        // Gabungin hasil, ambil yang terbesar
        return Math.max(leftMax, rightMax);
    }

    // Fungsi Divide and Conquer buat nyari nilai Midterm Score terendah (UTS)
    public static int findMinUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];  // Basis, jika udah ketemu angka terakhir, langsung return
        }
        
        int mid = (left + right) / 2;  // Bagi array jadi dua
        int leftMin = findMinUTS(arr, left, mid);  // Cari di kiri
        int rightMin = findMinUTS(arr, mid + 1, right);  // Cari di kanan
        
        return Math.min(leftMin, rightMin);  // Ambil yang terkecil
    }

    // Fungsi Brute Force buat ngitung rata-rata Final Score (UAS)
    public static double calculateAverageUAS(int[] uasScores) {
        double total = 0;
        // Looping nambahin nilai satu-satu
        for (int score : uasScores) {
            total += score;  // Nambahin ke total
        }
        return total / uasScores.length;  // Rata-rata
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa, nilai Midterm (UTS) dan Final (UAS)
        int[] utsScores = {78, 85, 90, 76, 92, 88, 80, 82}; // Nilai UTS
        int[] uasScores = {82, 88, 87, 79, 95, 85, 84, 84}; // Nilai UAS
        
        // a) Cari nilai UTS tertinggi pakai Divide and Conquer
        int maxUTS = findMaxUTS(utsScores, 0, utsScores.length - 1);
        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);

        // b) Cari nilai UTS terendah pakai Divide and Conquer
        int minUTS = findMinUTS(utsScores, 0, utsScores.length - 1);
        System.out.println("Nilai UTS terendah (Divide and Conquer): " + minUTS);

        // c) Hitung rata-rata nilai UAS pakai Brute Force
        double avgUAS = calculateAverageUAS(uasScores);
        System.out.println("Rata-rata nilai UAS (Brute Force): " + avgUAS);
        
        scanner.close(); // Jangan lupa tutup scanner, biar ngga ada memory leak
    }
} 
