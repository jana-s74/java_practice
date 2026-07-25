package Interfaces.interface_types;

interface SingleAnimal {
    void eat();
}

class SingleDog implements SingleAnimal {

    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SingleDog d = new SingleDog();
        d.eat();
    }
}