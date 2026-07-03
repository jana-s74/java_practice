class Student {
    void display() {
        System.out.println("Student Details");
    }
}

public class Anonymous2 {
    public static void main(String[] args) {
        Student s = new Student() {
            @Override
            void display() {
                System.out.println("Anonymous Student");
            }
        };
        s.display();
    }
}