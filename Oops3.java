
//single level inheritance
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

// multilevel inheritance
class EquilateralTriangle extends Triangle{  
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

// hierarchical inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14) * r * r);
    }
}

//hybrid inheritance
class Rectangle extends Shape{
    public void area(int l, int b){
        System.out.println(l * b);
    }
}

public class Oops3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(5, 10);

        EquilateralTriangle et1 = new EquilateralTriangle();
        et1.area(5, 10);

        Circle c1 = new Circle();
        c1.area(7);

        Rectangle r1 = new Rectangle();
        r1.area(5, 10);
    }
    
    
}
