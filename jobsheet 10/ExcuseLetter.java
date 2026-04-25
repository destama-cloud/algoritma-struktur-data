public class ExcuseLetter {
    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;

    ExcuseLetter() {
    }

    ExcuseLetter(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    void printData() {
        System.out.println("ID              : " + id);
        System.out.println("Name            : " + name);
        System.out.println("Class Name      : " + className);
        System.out.println("Type of Excuse  : " + typeOfExcuse);
        System.out.println("Duration        : " + duration + " day(s)");
    }
}