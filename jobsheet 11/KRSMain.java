import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue antrean = new KRSQueue(10);
        int choice;

        do {
            System.out.println("\n--- Menu Antrean KRS ---");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 Orang)");
            System.out.println("3. Lihat Semua Antrean");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Paling Belakang");
            System.out.println("6. Cek Statistik");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    antrean.enqueue(new Student(nim, nama, prodi, kls));
                    break;
                case 2:
                    antrean.processKRS();
                    break;
                case 3:
                    antrean.printAll();
                    break;
                case 4:
                    antrean.peekFirstTwo();
                    break;
                case 5:
                    antrean.peekLast();
                    break;
                case 6:
                    System.out.println("Total sudah diproses: " + antrean.completedCount);
                    System.out.println("Sisa kuota DPA: " + (30 - antrean.completedCount));
                    break;
            }
        } while (choice != 0);
    }
}