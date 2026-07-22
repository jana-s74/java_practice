import java.util.*;

public class OpenLock {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("0000");

        while (!queue.isEmpty()) {

            String lock = queue.poll();
            System.out.println(lock);

            if (lock.equals("0002")) {
                System.out.println("Lock Opened");
                break;
            }

            int num = Integer.parseInt(lock);
            num++;

            String next = String.format("%04d", num);
            queue.offer(next);
        }
    }
}