public class ExcuseLetterStack {
    ExcuseLetter[] stack;
    int top;
    int size;

    ExcuseLetterStack(int size) {
        this.size = size;
        stack = new ExcuseLetter[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
            System.out.println("Excuse letter has been submitted successfully.");
        } else {
            System.out.println("Excuse letter stack is full!");
        }
    }

    ExcuseLetter pop() {
        if (!isEmpty()) {
            ExcuseLetter letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("There is no excuse letter to process!");
            return null;
        }
    }

    ExcuseLetter peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no excuse letter in stack!");
            return null;
        }
    }

    void searchByName(String name) {
        boolean found = false;

        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Excuse letter found:");
                stack[i].printData();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Excuse letter with name " + name + " was not found.");
        }
    }
}