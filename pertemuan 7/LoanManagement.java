import java.util.*;

public class LoanManagement {

    // ===================== CLASS DEFINITIONS =====================

    static class Student {
        int id;
        String name;
        String studyProgram;

        Student(int id, String name, String studyProgram) {
            this.id = id;
            this.name = name;
            this.studyProgram = studyProgram;
        }
    }

    static class Book {
        String code;
        String title;
        int year;

        Book(String code, String title, int year) {
            this.code = code;
            this.title = title;
            this.year = year;
        }
    }

    static class Loan {
        Student student;
        Book book;
        int loanDuration;
        int late;
        int fine;

        Loan(Student student, Book book, int loanDuration, int late) {
            this.student = student;
            this.book = book;
            this.loanDuration = loanDuration;
            this.late = late;
            this.fine = late * 2000; // Denda = keterlambatan x 2000
        }
    }

    // ===================== DATA =====================

    static List<Student> studentList = new ArrayList<>();
    static List<Book> bookList = new ArrayList<>();
    static List<Loan> loanList = new ArrayList<>();

    // ===================== INIT DATA =====================

    static void initData() {
        // Students
        Student s1 = new Student(22001, "Abdul", "Informatics Engineering");
        Student s2 = new Student(22002, "Bestari", "Informatics Engineering");
        Student s3 = new Student(22003, "Gandi", "Business Information System");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Books
        Book b1 = new Book("B001", "Algorithm", 2020);
        Book b2 = new Book("B002", "Database", 2019);
        Book b3 = new Book("B003", "Programming", 2021);
        Book b4 = new Book("B004", "Physics", 2024);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        // Loans
        loanList.add(new Loan(s1, b1, 7, 2));
        loanList.add(new Loan(s2, b2, 3, 0));
        loanList.add(new Loan(s3, b3, 10, 5));
        loanList.add(new Loan(s3, b4, 6, 1));
        loanList.add(new Loan(s1, b2, 4, 0));
    }

    // ===================== MENU =====================

    static void showMenu() {
        System.out.println("=== Loan Management System in JTI Reading Room ===");
        System.out.println("1. Show Students");
        System.out.println("2. Show Books");
        System.out.println("3. Show Loan");
        System.out.println("4. Sorting based on Fine (Descending)");
        System.out.println("5. Search Loan by NIM");
        System.out.println("0. Finish");
    }

    // ===================== FEATURE 1: SHOW STUDENTS =====================

    static void showStudents() {
        System.out.println("Student List:");
        for (Student s : studentList) {
            System.out.println("Id: " + s.id + " | Name: " + s.name + " | Study Program: " + s.studyProgram);
        }
    }

    // ===================== FEATURE 2: SHOW BOOKS =====================

    static void showBooks() {
        System.out.println("Book List:");
        for (Book b : bookList) {
            System.out.println("Code: " + b.code + " | Tittle: " + b.title + " | Year: " + b.year);
        }
    }

    // ===================== FEATURE 3: SHOW LOANS =====================

    static void showLoans() {
        System.out.println("Loan List:");
        for (Loan l : loanList) {
            System.out.println(l.student.name + " | " + l.book.title +
                    " | Loan Duration: " + l.loanDuration +
                    " | Late: " + l.late +
                    " | Fine: " + l.fine);
        }
    }

    // ===================== FEATURE 4: SORT BY FINE (DESCENDING) =====================

    static void sortByFine() {
        // Bubble Sort - descending berdasarkan Fine
        List<Loan> sorted = new ArrayList<>(loanList);
        int n = sorted.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sorted.get(j).fine < sorted.get(j + 1).fine) {
                    Loan temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }

        System.out.println("After Sorted(biggest fine):");
        for (Loan l : sorted) {
            System.out.println(l.student.name + " | " + l.book.title +
                    " | Loan Duration: " + l.loanDuration +
                    " | Late: " + l.late +
                    " | Fine: " + l.fine);
        }
    }

    // ===================== FEATURE 5: SEARCH LOAN BY NIM =====================

    static void searchByNIM(int id) {
        boolean found = false;
        for (Loan l : loanList) {
            if (l.student.id == id) {
                System.out.println(l.student.name + " | " + l.book.title +
                        " | Loan Duration: " + l.loanDuration +
                        " | Late: " + l.late +
                        " | Fine: " + l.fine);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No loan found for NIM: " + id);
        }
    }

    // ===================== MAIN =====================

    public static void main(String[] args) {
        initData();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showStudents();
                    break;
                case 2:
                    showBooks();
                    break;
                case 3:
                    showLoans();
                    break;
                case 4:
                    sortByFine();
                    break;
                case 5:
                    System.out.print("Input Id: ");
                    int id = sc.nextInt();
                    searchByNIM(id);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}