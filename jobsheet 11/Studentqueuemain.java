import java.util.Scanner;

public class Studentqueuemain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentqueue queue = new Studentqueue(5);
        int choice;

        do {
            System.out.println("\n=== Academic Service Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("6. Check rear of the queue"); //[cite: 1]
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Name  : "); String name = sc.nextLine();
                    System.out.print("Study Program : "); String sp = sc.nextLine();
                    System.out.print("Class : "); String cn = sc.nextLine();
                    Student std = new Student(nim, name, sp, cn);
                    queue.enqueue(std);
                    break;
                case 2:
                    Student served = queue.dequeue();
                    if (served != null) {
                        System.out.println("Student being served:");
                        served.print();
                    }
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    System.out.println("Queue size: " + queue.size);
                    break;
                // --- TAMBAHAN UNTUK NOMOR 4 ---
                case 6:
                    queue.viewRear(); //[cite: 1]
                    break;
                case 0:
                    System.out.println("Thanks!!");
                    break;
                default:
                    System.out.println("Invalid menu!!");
            }
        } while (choice != 0);
    }
}