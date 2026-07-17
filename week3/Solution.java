import java.util.Scanner;

public class Solution {

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = piles[0];

        // Find maximum pile
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate hours needed
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];

        System.out.println("Enter bananas in each pile:");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter hours (h): ");
        int h = sc.nextInt();

        int result = minEatingSpeed(piles, h);

        System.out.println("Minimum Eating Speed = " + result);

        sc.close();
    }
}