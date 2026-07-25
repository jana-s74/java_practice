package Interfaces.interface_types;

interface MultiAnimal {
    void eat();
}

interface MultiMammal extends MultiAnimal {
    void walk();
}

class MultiDog implements MultiMammal {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void walk() {
        System.out.println("Dog is walking");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        MultiDog d = new MultiDog();

        d.eat();
        d.walk();
    }
}