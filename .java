import java.util.Stack;

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x) {
        s1.push(x);
    }

    int pop() {

        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }

        return s2.pop();
    }
}