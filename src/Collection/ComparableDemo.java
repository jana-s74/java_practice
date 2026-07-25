package Collection;

import java.util.*;

class ComparableEmployee implements Comparable<ComparableEmployee> {

    int id;
    String name;
    int age;

    ComparableEmployee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(ComparableEmployee e) {
        return this.age - e.age;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<ComparableEmployee> list = new ArrayList<>();

        list.add(new ComparableEmployee(101, "John", 25));
        list.add(new ComparableEmployee(102, "David", 20));
        list.add(new ComparableEmployee(103, "Alex", 30));

        Collections.sort(list);

        for (ComparableEmployee e : list) {
            e.display();
        }
    }
}