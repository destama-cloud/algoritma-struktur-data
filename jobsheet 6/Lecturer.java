public class Lecturer {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String jk;
        if (gender) {
            jk = "Male";
        } else {
            jk = "Female";
        }

        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + jk);
        System.out.println("Age     : " + age);
        System.out.println("------------------------");
    }
} 
    

