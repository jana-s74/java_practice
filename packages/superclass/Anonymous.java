class Person {

    void display() {
        System.out.println("I am a Person");
    }

}

public class Anonymous {

    public static void main(String[] args) {

        Person p = new Person() {

            @Override
            void display() {
                System.out.println("I am an Anonymous Person");
            }

        };

        p.display();
    }
}