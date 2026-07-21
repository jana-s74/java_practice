import java.util.*;

public class Permutations {

    static void permute(int[] a, int index) {

        if (index == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }

        for (int i = index; i < a.length; i++) {

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;

            permute(a, index + 1);

            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        permute(a, 0);
    }
}