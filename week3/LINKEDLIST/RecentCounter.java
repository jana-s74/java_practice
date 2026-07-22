import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        // Add current request
        queue.offer(t);

        // Remove requests older than (t - 3000)
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        // Return number of recent requests
        return queue.size();
    }

    public static void main(String[] args) {

        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));      // 1
        System.out.println(rc.ping(100));    // 2
        System.out.println(rc.ping(3001));   // 3
        System.out.println(rc.ping(3002));   // 3
    }
}