import java.util.*;

public class Dota2Senate {
    public static void main(String[] args) {

        String senate = "RDD";

        Queue<Character> queue = new LinkedList<>();

        for (char ch : senate.toCharArray()) {
            queue.offer(ch);
        }

        while (queue.size() > 1) {

            char first = queue.poll();
            char second = queue.poll();

            if (first == second) {
                queue.offer(first);
            } else {
                queue.offer(first);
            }
        }

        System.out.println("Winner = " + queue.peek());
    }
}