 class Vehicle {
    void selection(){
        System.out.println("Vehicle selection");
    }
}

class Car extends Vehicle {
    void selection(){
        System.out.println("Car selection");
    }
}

class ElectricCar extends Car {
    void selection(){
        System.out.println("Electric Car selection");
    }
}

public class multi_level1 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.selection();
    }
}
