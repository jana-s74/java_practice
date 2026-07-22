import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {

        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = new int[temp.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temp.length; i++) {

            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int index = stack.pop();
                ans[index] = i - index;
            }

            stack.push(i);
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}