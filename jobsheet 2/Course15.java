public class Course15 {

    String kodeCourse;
    String name;
    int sks;
    int numberOfHours;

    // Default constructor
    public Course15() {
    }

    // Parameterized constructor
    public Course15(String kodeCourse, String name, int sks, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.sks = sks;
        this.numberOfHours = numberOfHours;
    }

    void displayInfo() {
        System.out.println("Course Code : " + kodeCourse);
        System.out.println("Course Name : " + name);
        System.out.println("Credits     : " + sks);
        System.out.println("Hours/Week  : " + numberOfHours);
    }

    void changeSKS(int sksNew) {
        sks = sksNew;
        System.out.println("Credits have been updated.");
    }

    void addHours(int hours) {
        numberOfHours += hours;
        System.out.println("Hours successfully added.");
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Hours successfully reduced.");
            System.out.println("New total hours: " + numberOfHours);
        } else {
            System.out.println("Reduction failed. Hours are insufficient.");
        }
    }
}