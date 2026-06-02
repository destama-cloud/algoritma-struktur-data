package jobsheet13;

public class DoubleLinkedLists {

    Node head;
    Node tail;

    DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node temp = head;

        while (temp != null) {

            if (temp.data.nim.equalsIgnoreCase(key)) {

                if (temp == tail) {
                    addLast(data);
                } else {
                    Node newNode = new Node(data);

                    newNode.next = temp.next;
                    newNode.prev = temp;

                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                return;
            }

            temp = temp.next;
        }

        System.out.println("Insertion failed. Data (" + key + ") not found!!");
    }

    // Assignment No.1
    void add(Student data, int index) {

        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;

        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index melebihi ukuran linked list!");
            return;
        }

        if (temp == tail) {
            addLast(data);
        } else {
            Node newNode = new Node(data);

            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {

        if (index < 0 || index >= getSize()) {
            System.out.println("Index tidak valid!");
            return;
        }

        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (index == 0) {
            removeFirst();
        } else {

            Node temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    // Assignment No.2
    void removeAfter(String key) {

        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }

        Node temp = head;

        while (temp != null) {

            if (temp.data.nim.equalsIgnoreCase(key)) {

                if (temp.next == null) {
                    System.out.println("Tidak ada node setelah key tersebut!");
                    return;
                }

                if (temp.next == tail) {
                    removeLast();
                } else {

                    Node deleteNode = temp.next;

                    temp.next = deleteNode.next;
                    deleteNode.next.prev = temp;
                }
                return;
            }

            temp = temp.next;
        }

        System.out.println("Data tidak ditemukan!");
    }

    // Assignment No.3
    Student getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    Student getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.data;
    }

    Student getIndex(int index) {

        if (index < 0 || index >= getSize()) {
            return null;
        }

        Node temp = head;
        int i = 0;

        while (temp != null) {

            if (i == index) {
                return temp.data;
            }

            temp = temp.next;
            i++;
        }

        return null;
    }

    // Assignment No.4
    int getSize() {

        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Assignment No.5
    int indexOf(String key) {

        Node temp = head;
        int index = 0;

        while (temp != null) {

            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }

    void print() {

        if (!isEmpty()) {

            Node temp = head;

            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }

            System.out.println();
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }
}