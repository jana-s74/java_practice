package Collection;

import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> list = new Vector<>();

        list.add("Jana");
        list.add("Kumar");
        list.add("Raja");
        list.add("Arun");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}