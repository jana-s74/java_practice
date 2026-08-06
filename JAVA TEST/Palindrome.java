import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        String str = input1.toLowerCase();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}