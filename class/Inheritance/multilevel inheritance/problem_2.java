class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Square Area");
    }
}

public class problem_2 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();
        c.area();
        Square s = new Square();
        s.draw();
        s.area();
    }
}