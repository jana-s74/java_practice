public class AverageValue {

    public static int averageValue(int[] nums) {

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            if (num % 6 == 0) {

                sum += num;
                count++;
            }
        }

        if (count == 0)
            return 0;

        return sum / count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 6, 10, 12, 15};

        System.out.println(averageValue(nums));
    }
}