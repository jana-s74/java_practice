package OOP_Class.Inheritance;

class Vehicle {
    void start(){
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is driving...");
    }
}
class MainVehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}