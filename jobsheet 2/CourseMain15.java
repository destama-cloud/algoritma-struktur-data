public class CourseMain15 {

    public static void main(String[] args) {

        // Object using default constructor
        Course15 c1 = new Course15();
        c1.kodeCourse = "ALSD01";
        c1.name = "Data Structures";
        c1.sks = 3;
        c1.numberOfHours = 4;

        c1.displayInfo();
        c1.changeSKS(4);
        c1.addHours(2);
        c1.reduceHours(3);
        c1.displayInfo();

        System.out.println();

        // Object using parameterized constructor
        Course15 c2 = new Course15("PRG02", "Object Oriented Programming", 3, 5);

        c2.displayInfo();
        c2.addHours(1);
        c2.reduceHours(2);
        c2.displayInfo();
    }
}