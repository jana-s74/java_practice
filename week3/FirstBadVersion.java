public class FirstBadVersion {

    // First bad version
    static int firstBad = 4;

    // API
    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    // Binary Search
    public static int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low < high) {

            int mid = low + (high - low) / 2;

            System.out.println("Checking Version : " + mid);

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int n = 8;

        int answer = firstBadVersion(n);

        System.out.println("First Bad Version = " + answer);
    }
}