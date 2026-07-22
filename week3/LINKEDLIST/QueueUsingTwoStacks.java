import java.util.Stack;

public class QueueUsingTwoStacks {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    // Enqueue
    void offer(int value) {
        input.push(value);
    }

    // Dequeue
    void poll() {

        // Move elements only if output stack is empty
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Removed: " + output.pop());
    }

    // Front Element
    void peek() {

        // Move elements only if output stack is empty
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front Element: " + output.peek());
    }

    public static void main(String[] args) {

        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        q.peek();   // Front Element: 10

        q.poll();   // Removed: 10

        q.peek();   // Front Element: 20

        q.poll();   // Removed: 20

        q.poll();   // Removed: 30

        q.poll();   // Removed: 40

        q.poll();   // Queue is Empty
    }
}