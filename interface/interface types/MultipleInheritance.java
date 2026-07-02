interface Car {
    void car();
}

interface Bike {
    void bike();
}

class Vehicle implements Car, Bike {

    public void car() {
        System.out.println("Car Started");
    }

    public void bike() {
        System.out.println("Bike Started");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        v.car();
        v.bike();
    }
}