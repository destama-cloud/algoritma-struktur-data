public class TopStudent {
    Student[] listStudents;
    int idx;

    public TopStudent(int size) {
        listStudents = new Student[size];
    }

    public void add(Student student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student temp = listStudents[i];
            int j = i;

            while (j > 0 && listStudents[j - 1].gpa < temp.gpa) {
                listStudents[j] = listStudents[j - 1];
                j--;
            }

            listStudents[j] = temp;
        }
    }
} 
