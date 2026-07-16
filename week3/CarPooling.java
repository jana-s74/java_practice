public class CarPooling {

    public static boolean carPooling(int[][] trips, int capacity) {

        // Stops from 0 to 1000
        int[] passengers = new int[1001];

        for (int[] trip : trips) {
            int numPassengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            passengers[from] += numPassengers;
            passengers[to] -= numPassengers;
        }

        int currentPassengers = 0;

        for (int i = 0; i < passengers.length; i++) {
            currentPassengers += passengers[i];

            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] trips = {
            {2, 1, 5},
            {3, 3, 7}
        };

        int capacity = 3;

        if (carPooling(trips, capacity)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}