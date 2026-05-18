public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int completedCount = 0;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Student dt) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = dt;
            size++;
            System.out.println(dt.name + " berhasil masuk antrean.");
        } else {
            System.out.println("Antrean sudah penuh!");
        }
    }

    void processKRS() {
        if (isEmpty()) {
            System.out.println("Antrean kosong!");
            return;
        }

        int limit = (size >= 2) ? 2 : 1; 
        System.out.println("Memproses " + limit + " mahasiswa...");

        for (int i = 0; i < limit; i++) {
            Student temp = data[front];
            System.out.print("Selesai: ");
            temp.print();
            front = (front + 1) % max;
            size--;
            completedCount++;
        }
    }

    void printAll() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                data[i].print();
                i = (i + 1) % max;
            }
            data[i].print(); 
            System.out.println("Jumlah di antrean: " + size);
        } else {
            System.out.println("Antrean kosong!");
        }
    }

    void peekFirstTwo() {
        if (isEmpty()) {
            System.out.println("Antrean kosong!");
        } else {
            data[front].print();
            if (size >= 2) {
                data[(front + 1) % max].print();
            }
        }
    }

    void peekLast() {
        if (!isEmpty()) {
            data[rear].print();
        } else {
            System.out.println("Antrean kosong!");
        }
    }
}