package Interfaces.interface_types;

interface MultiCar {
    void car();
}

interface MultiBike {
    void bike();
}

class MultiVehicle implements MultiCar, MultiBike {

    public void car() {
        System.out.println("Car Started");
    }

    public void bike() {
        System.out.println("Bike Started");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        MultiVehicle v = new MultiVehicle();

        v.car();
        v.bike();
    }
}