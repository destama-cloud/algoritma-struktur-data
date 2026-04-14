import java.util.Scanner;

public class duties2 {

    static Scanner input = new Scanner(System.in);

    // Function untuk input data jadwal
    public static void inputSchedule(String[][] schedule, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));

            System.out.print("Course Name : ");
            schedule[i][0] = input.nextLine();

            System.out.print("Room        : ");
            schedule[i][1] = input.nextLine();

            System.out.print("Day         : ");
            schedule[i][2] = input.nextLine();

            System.out.print("Time        : ");
            schedule[i][3] = input.nextLine();
        }
    }

    // Function untuk menampilkan semua jadwal dalam bentuk tabel
    public static void displayAll(String[][] schedule, int n) {

        System.out.println("\n================ LECTURE SCHEDULE ================");
        System.out.printf("%-25s %-10s %-12s %-15s\n",
                "Course Name", "Room", "Day", "Time");
        System.out.println("===================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-10s %-12s %-15s\n",
                    schedule[i][0],
                    schedule[i][1],
                    schedule[i][2],
                    schedule[i][3]);
        }
    }

    // Function untuk menampilkan jadwal berdasarkan hari tertentu
    public static void searchByDay(String[][] schedule, int n) {

        System.out.print("\nMasukkan hari yang dicari: ");
        String day = input.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {

                if (!found) {
                    System.out.println("\nJadwal pada hari " + day + ":");
                    found = true;
                }

                System.out.println(schedule[i][0] + " | "
                        + schedule[i][1] + " | "
                        + schedule[i][3]);
            }
        }

        if (!found) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // Function untuk menampilkan jadwal berdasarkan nama mata kuliah
    public static void searchByCourse(String[][] schedule, int n) {

        System.out.print("\nMasukkan nama mata kuliah: ");
        String course = input.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(course)) {

                System.out.println("\nDetail Jadwal:");
                System.out.println("Course : " + schedule[i][0]);
                System.out.println("Room   : " + schedule[i][1]);
                System.out.println("Day    : " + schedule[i][2]);
                System.out.println("Time   : " + schedule[i][3]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(input.nextLine());

        // Membuat array 2 dimensi
        String[][] schedule = new String[n][4];

        // Memanggil function
        inputSchedule(schedule, n);
        displayAll(schedule, n);
        searchByDay(schedule, n);
        searchByCourse(schedule, n);

        input.close();
    }
}