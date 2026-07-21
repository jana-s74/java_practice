import java.util.*;

public class Subset {

    static void findSubset(List<Integer> nums, int start, List<Integer> subset) {

        // Print current subset
        System.out.println(subset);

        for (int i = start; i < nums.size(); i++) {

            // Choose
            subset.add(nums.get(i));

            // Recurse
            findSubset(nums, i + 1, subset);

            // Backtrack
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3);

        findSubset(nums, 0, new ArrayList<>());
    }
}