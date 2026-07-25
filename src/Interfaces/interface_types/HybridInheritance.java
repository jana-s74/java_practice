package Interfaces.interface_types;

interface HybridAnimal {
    void eat();
}

interface HybridPet {
    void play();
}

class HybridDog implements HybridAnimal {

    public void eat() {
        System.out.println("Dog is eating");
    }
}

class HybridPuppy extends HybridDog implements HybridPet {

    public void play() {
        System.out.println("Puppy is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        HybridPuppy p = new HybridPuppy();

        p.eat();
        p.play();
    }
}