
class Student{
    String name;
    int age;


    // polymorphism  // method overloading
    public void printInfo(String name){
        System.out.println(name);
        
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
        
    }
}

class Shape{
    String color;
}

class Triangle extends Shape{

}

public class Oops2 {
    public static void main(String[] args) {

Student s1 = new Student();
s1.name = "Rohit";
s1.age = 22;

s1.printInfo(s1.name, s1.age);

Triangle t1 = new Triangle();
t1.color = "Red";
System.out.println(t1.color);
       
}
}