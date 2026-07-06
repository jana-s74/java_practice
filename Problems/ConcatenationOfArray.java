public class ConcatenationOfArray
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3};

        // Create new array of double size
        int[] ans = new int[nums.length * 2];

        // Copy array twice
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];

            ans[i + nums.length] = nums[i];
        }

        // Print answer
        System.out.print("Answer Array: ");

        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}