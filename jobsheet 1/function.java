public class function {

    // Function untuk menghitung total pendapatan satu cabang
    public static int hitungPendapatan(int aglonema, int yam, int alocasia, int rose) {

        // Harga masing-masing bunga
        int hargaAglonema = 75000;
        int hargaYam = 50000;
        int hargaAlocasia = 60000;
        int hargaRose = 10000;

        // Menghitung total pendapatan
        int total = (aglonema * hargaAglonema)
                  + (yam * hargaYam)
                  + (alocasia * hargaAlocasia)
                  + (rose * hargaRose);

        return total;
    }

    // Function untuk menentukan status cabang
    public static String tentukanStatus(int pendapatan) {

        if (pendapatan > 1500000) {
            return "Very Good";
        } else {
            return "Need Evaluation";
        }
    }

    public static void main(String[] args) {

        // Data stok bunga masing-masing cabang
        int[][] data = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        // Perulangan untuk menghitung tiap cabang
        for (int i = 0; i < data.length; i++) {

            // Memanggil function untuk menghitung pendapatan
            int totalPendapatan = hitungPendapatan(
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3]
            );

            // Memanggil function untuk menentukan status
            String status = tentukanStatus(totalPendapatan);

            // Menampilkan hasil
            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Total Pendapatan : Rp " + totalPendapatan);
            System.out.println("Status           : " + status);
            System.out.println();
        }
    }
}