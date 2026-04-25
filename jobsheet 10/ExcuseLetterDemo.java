import java.util.Scanner;

public class ExcuseLetterDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack stack = new ExcuseLetterStack(5);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Class Name: ");
                    String className = scan.nextLine();

                    System.out.print("Type of Excuse (S/I): ");
                    char type = scan.nextLine().charAt(0);

                    System.out.print("Duration: ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    ExcuseLetter letter = new ExcuseLetter(id, name, className, type, duration);
                    stack.push(letter);
                    break;

                case 2:
                    ExcuseLetter processed = stack.pop();

                    if (processed != null) {
                        System.out.println("Processing latest excuse letter:");
                        processed.printData();
                    }
                    break;

                case 3:
                    ExcuseLetter latest = stack.peek();

                    if (latest != null) {
                        System.out.println("Latest excuse letter:");
                        latest.printData();
                    }
                    break;

                case 4:
                    System.out.print("Input student name to search: ");
                    String searchName = scan.nextLine();

                    stack.searchByName(searchName);
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

            System.out.println();

        } while (choice != 0);

        scan.close();
    }
}

class ExcuseLetterStack {
    private ExcuseLetter[] stack;
    private int top;
    private int maxSize;

    public ExcuseLetterStack(int size) {
        maxSize = size;
        stack = new ExcuseLetter[maxSize];
        top = -1;
    }

    public void push(ExcuseLetter letter) {
        if (top < maxSize - 1) {
            stack[++top] = letter;
            System.out.println("Excuse letter submitted.");
        } else {
            System.out.println("Stack is full. Cannot submit more letters.");
        }
    }

    public ExcuseLetter pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty. No letters to process.");
            return null;
        }
    }

    public ExcuseLetter peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        System.out.println("Searching for excuse letters by name: " + name);
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                stack[i].printData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No excuse letter found for the name: " + name);
        }
    }
}