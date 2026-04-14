public class LecturerData {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx;

    public void add(Lecturer dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full");
        }
    }

    public void print() {
        if (idx == 0) {
            System.out.println("No lecturer data available.");
        } else {
            for (int i = 0; i < idx; i++) {
                lecturerData[i].print();
            }
        }
    }

    // ASC = termuda ke tertua, pakai Bubble Sort
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // DSC = tertua ke termuda, pakai Selection Sort
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }

            Lecturer temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
} 
