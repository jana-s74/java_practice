package string.stringbuffer.interfacedemo;

interface Car {
    void start();
}

interface Bike {
    void start();
}

interface Bicycle {
    void start();
}

class Student implements Car, Bike, Bicycle {

    public void start() {
        System.out.println("All vehicles started.");
    }
}

public class interface1 {
    public static void main(String[] args) {

        Student s = new Student();
        s.start();
    }
}