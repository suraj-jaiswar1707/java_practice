
class Pen{
 String color;
 String type;
    public void write(){
        System.out.println("Writing Something");
    } 
    
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterisez constractor
    // Student(){
    //     System.out.println("Constructor Called");
    // }

    //parameterized constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }
    

        //copy constractor

        Student (Student s2){
            this.name = s2.name;
            this.age = s2.age;
        }


        // non/default constractor for copy constractor
        Student(){

        }
}

public class Opps { 
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Ball Point";
        // pen1.printColor();
        // pen2.printColor();


        // Student s1 = new Student();
        // s1.name = "suraj";
        // s1.age = 26;
        // s1.printInfo();


        // for copy constractor
        Student s1 = new Student();
        s1.name = "suraj";
        s1.age = 26;


        Student s2 = new Student(s1);
        s2.printInfo();

    }
}