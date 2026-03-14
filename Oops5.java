
abstract class Animal {
    abstract void walk();  //
    Animal() {
        System.out.println("you are created a new aAnimal");
    }
    public void eat() {
        System.out.println("eats food");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("created a Horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}


public class Oops5 {
    public static void main(String[] args) {
        //abstraction 

        Horse horse = new Horse();
        horse.walk();
        horse.eat();


    } 
}