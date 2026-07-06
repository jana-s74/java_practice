package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("jana");
        list.add("kumar");
        list.add("raja");
        list.add("arun");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}