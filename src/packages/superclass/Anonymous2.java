package packages.superclass;

class AnonStudent {
    void display() {
        System.out.println("Student Details");
    }
}

public class Anonymous2 {
    public static void main(String[] args) {
        AnonStudent s = new AnonStudent() {
            @Override
            void display() {
                System.out.println("Anonymous Student");
            }
        };
        s.display();
    }
}