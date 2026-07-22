import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {

        String[] ops = {"5", "2", "C", "D", "+"};

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {

            if (op.equals("C")) {
                stack.pop();
            } 
            else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } 
            else if (op.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } 
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}