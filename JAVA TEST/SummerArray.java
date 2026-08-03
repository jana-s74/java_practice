import java.util.Scanner;

public class SummerArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        // Read array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int swaps = 0;

        // Bubble Sort like approach
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N - 1; j++) {

                // Even before Odd -> Swap
                if (A[j] % 2 == 0 && A[j + 1] % 2 == 1) {

                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                    swaps++;
                }
            }
        }

        System.out.println(swaps);
    }
}