// Parent Class
class Animal {
    String name;
    int age;

    // Parameterized Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal Constructor Called");
    }

    void displayAnimal() {
        System.out.println("Animal Name : " + name);
        System.out.println("Animal Age  : " + age);
    }
}

// Child Class
class Dog extends Animal {
    String breed;

    // Parameterized Constructor
    Dog(String name, int age, String breed) {
        super(name, age); // Calls Parent Constructor
        this.breed = breed;
        System.out.println("Dog Constructor Called");
    }

    void displayDog() {
        displayAnimal();
        System.out.println("Dog Breed   : " + breed);
    }
}

// Main Class
public class Super1 {
    public static void main(String[] args) {

        // Creating Object
        Dog d1 = new Dog("Tommy", 4, "Golden Retriever");

        System.out.println();

        // Display Details
        d1.displayDog();
    }
}