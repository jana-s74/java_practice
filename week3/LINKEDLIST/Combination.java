import java.util.*;

public class Combination {

    static int n = 4;
    static int k = 2;

    static void findCombination(int index, List<Integer> list) {

        if (list.size() == k) {
            System.out.println(list);
            return;
        }

        if (index > n)
            return;

        // Take
        list.add(index);
        findCombination(index + 1, list);

        // Backtrack
        list.remove(list.size() - 1);

        // Skip
        findCombination(index + 1, list);
    }

    public static void main(String[] args) {
        findCombination(1, new ArrayList<>());
    }
}