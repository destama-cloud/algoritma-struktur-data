package jobsheet13;

public class DoubleLinkedListsMain {

    public static void main(String[] args) {

        DoubleLinkedLists dll = new DoubleLinkedLists();

        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.70));
        dll.addLast(new Student("113", "Herco", "TI-1I", 3.89));
        dll.addLast(new Student("114", "Rizki", "TI-1I", 3.80));
        dll.addLast(new Student("115", "Hanzel", "TI-1I", 3.60));

        System.out.println("Data Awal");
        dll.print();

        System.out.println("===== ADD INDEX =====");
        dll.add(new Student("116", "Eiyu", "TI-1I", 3.90), 2);
        dll.print();

        System.out.println("===== REMOVE AFTER =====");
        dll.removeAfter("112");
        dll.print();

        System.out.println("===== GET FIRST =====");
        dll.getFirst().print();

        System.out.println("===== GET LAST =====");
        dll.getLast().print();

        System.out.println("===== GET INDEX 2 =====");
        dll.getIndex(2).print();

        System.out.println("===== SIZE =====");
        System.out.println(dll.getSize());

        System.out.println("===== INDEX OF 114 =====");
        System.out.println(dll.indexOf("114"));
    }
}