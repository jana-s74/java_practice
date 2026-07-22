import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    void push(int value) {
        stack.push(value);

        if (min.isEmpty() || value <= min.peek()) {
            min.push(value);
        }
    }

    void pop() {
        if (stack.peek().equals(min.peek())) {
            min.pop();
        }
        System.out.println("Popped: " + stack.pop());
    }

    void getMin() {
        System.out.println("Minimum: " + min.peek());
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        s.getMin(); // 2

        s.pop();

        s.getMin(); // 3
    }
}