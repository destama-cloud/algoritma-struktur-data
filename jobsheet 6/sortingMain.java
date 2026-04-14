public class sortingMain {
    public static void main(String[] args) {

        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting sorting1 = new Sorting(a);

        System.out.println("Original array:");
        sorting1.print();
        sorting1.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting1.print();

        System.out.println();

        int[] b = {30, 20, 2, 8, 14};
        Sorting sorting2 = new Sorting(b);

        System.out.println("Original array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();

        System.out.println();

        int[] c = {40, 10, 4, 9, 3};
        Sorting sorting3 = new Sorting(c);

        System.out.println("Original array:");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
} 
