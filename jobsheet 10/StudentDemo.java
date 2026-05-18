public class StudentDemo {
    String name;
    String nim;
    String className;
    int grade;

    public StudentDemo(String name, String nim, String className) {
        this.name = name;
        this.nim = nim;
        this.className = className;
        this.grade = -1; // -1 means not yet graded
        
    }

    public void grading(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String gradeInfo = (grade == -1) ? "Not graded" : String.valueOf(grade);
        return String.format("Name: %s | NIM: %s | Class: %s | Grade: %s",
                name, nim, className, gradeInfo);
    }
}