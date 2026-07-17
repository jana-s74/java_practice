import java.util.Scanner;

public class Sqrt {

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int result = mySqrt(x);

        System.out.println("Square Root = " + result);

        sc.close();
    }
}