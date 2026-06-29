package string.stringbufferinterface2.interfacedemo;

interface Car {
    void carStart();
}

interface Bike {
    void bikeStart();
}

interface Bicycle {
    void bicycleStart();
}

class Student implements Car, Bike, Bicycle {

    public void carStart() {
        System.out.println("Car Started");
    }

    public void bikeStart() {
        System.out.println("Bike Started");
    }

    public void bicycleStart() {
        System.out.println("Bicycle Started");
    }
}

public class interface2 {
    public static void main(String[] args) {

        Student s = new Student();

        s.carStart();
        s.bikeStart();
        s.bicycleStart();
    }
}