import java.util.*;

public class CombinationSum {

    static void solve(int[] a, int target, int index, List<Integer> list) {

        if (target == 0) {
            System.out.println(list);
            return;
        }

        if (target < 0 || index == a.length)
            return;

        list.add(a[index]);
        solve(a, target - a[index], index, list);

        list.remove(list.size() - 1);
        solve(a, target, index + 1, list);
    }

    public static void main(String[] args) {

        int[] a = {2, 3, 6, 7};
        solve(a, 7, 0, new ArrayList<>());
    }
}