import java.util.Scanner;

public class FibonacciNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("YES");
            return;
        }

        int a = 0;
        int b = 1;

        while (b <= N) {

            if (b == N) {
                System.out.println("YES");
                return;
            }

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("NO");
    }
}