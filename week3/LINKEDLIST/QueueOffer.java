import java.util.LinkedList;
import java.util.Queue;

public class QueueOffer {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Insert elements using offer()
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue : " + queue);

        // Front element
        System.out.println("Front : " + queue.peek());

        // Remove front element
        System.out.println("Removed : " + queue.poll());

        // Queue after removal
        System.out.println("Queue : " + queue);

        // Size
        System.out.println("Size : " + queue.size());

        // Check empty
        System.out.println("Is Empty : " + queue.isEmpty());

        // Search element
        System.out.println("Contains 30 : " + queue.contains(30));

        // Clear queue
        queue.clear();

        System.out.println("Queue after clear : " + queue);
    }
}