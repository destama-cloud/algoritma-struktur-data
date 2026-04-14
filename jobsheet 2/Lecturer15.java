public class Lecturer15 {

    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    // Default constructor
    public Lecturer15() {
    }

    // Parameterized constructor
    public Lecturer15(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void displayInformation() {
        System.out.println("ID Lecturer : " + idLecturer);
        System.out.println("Name        : " + name);
        System.out.println("Active      : " + activeStatus);
        System.out.println("Year Entry  : " + yearOfEntry);
        System.out.println("Expertise   : " + expertiseCompetency);
    }

    void setActiveStatus(boolean status) {
        activeStatus = status;
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }

}
