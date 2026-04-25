class Student {
    int nim;
    String name;
    String className;
}

public class StudentAssignmentStack {
    Student[] stack;
    int top;
    int size;

    StudentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new Student[size];
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    Student pop() {
        if (!isEmpty()) {
            Student std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    void print() {
        System.out.println("Assignment list:");
        System.out.println("NIM\tName\tClass Name");

        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
            System.out.println("");
        }
    }

    // Nomor 5: menampilkan mahasiswa pertama yang mengumpulkan tugas
    Student getFirstSubmitted() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // Nomor 6: menghitung jumlah tugas yang ada di stack
    int countAssignments() {
        return top + 1;
    }
}