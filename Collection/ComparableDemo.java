import java.util.*;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int age;

    Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employee e) {
        return this.age - e.age;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "John", 25));
        list.add(new Employee(102, "David", 20));
        list.add(new Employee(103, "Alex", 30));

        Collections.sort(list);

        for (Employee e : list) {
            e.display();
        }
    }
}