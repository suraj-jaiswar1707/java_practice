
interface Animal {
    void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }

}

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newSchool";
    }

}
public class Oops6 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        Student.school = "JMV";
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.school);
        Student.changeSchool();
        System.out.println(Student.school);
            
    }
}
