public class TeacherMain15 {

    public static void main(String[] args) {

        // Object using default constructor
        Lecturer15 l1 = new Lecturer15();
        l1.idLecturer = "L001";
        l1.name = "Dr. Budi Santoso";
        l1.activeStatus = true;
        l1.yearOfEntry = 2015;
        l1.expertiseCompetency = "Data Structures";

        l1.displayInformation();
        System.out.println("Years of Work: " + l1.calculateTimeWork(2025));

        System.out.println();

        // Object using parameterized constructor
        Lecturer15 l2 = new Lecturer15("L002", "Dr. Siti Rahma", true, 2018, "Database Systems");

        l2.displayInformation();
        l2.setActiveStatus(false);
        l2.changeSkill("Artificial Intelligence");

        System.out.println("\nAfter Update:");
        l2.displayInformation();
        System.out.println("Years of Work: " + l2.calculateTimeWork(2025));
    }
}