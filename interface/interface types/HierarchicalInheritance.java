interface Animal {
    void eat();
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal {

    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        c.eat();
    }
}