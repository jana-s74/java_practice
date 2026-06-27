import java.util.Scanner;

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ones++;
        }

        String ans = "";

        for (int i = 0; i < ones - 1; i++)
            ans += "1";

        for (int i = 0; i < s.length() - ones; i++)
            ans += "0";

        ans += "1";

        System.out.println(ans);
    }
}