class Shape {

    void area(int side) {
        System.out.println("Square Area = " + (side * side));
    }

    void area(int length, int width) {
        System.out.println("Rectangle Area = " + (length * width));
    }
    void area(double radius) {
        System.out.println("Circle Area = " + (3.14159 * radius * radius));
    }
}

public class overloading
 {
    public static void main(String[] args) {

        Shape obj = new Shape();

        obj.area(5);       
        obj.area(8, 4);     
        obj.area(3.5);      
    }
}