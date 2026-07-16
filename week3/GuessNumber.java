import java.util.Scanner;

public class GuessNumber {

    // Secret number
    static int secret = 37;

    // Guess API
    public static int guess(int num) {

        if (num == secret)
            return 0;

        if (num < secret)
            return 1;

        return -1;
    }

    // Binary Search
    public static int guessNumber(int n) {

        int low = 1;
        int high = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            System.out.println("Guessing : " + mid);

            int result = guess(mid);

            if (result == 0) {
                return mid;
            }

            else if (result == 1) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number (n): ");
        int n = sc.nextInt();

        int answer = guessNumber(n);

        System.out.println("Secret Number = " + answer);

        sc.close();
    }
}