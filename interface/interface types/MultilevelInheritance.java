interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void walk();
}

class Dog implements Mammal {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void walk() {
        System.out.println("Dog is walking");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.walk();
    }
}