import java.util.*;

public class LetterCasePermutation {

    static void solve(char[] s, int i) {
        if (i == s.length) {
            System.out.println(new String(s));
            return;
        }

        if (Character.isLetter(s[i])) {

            s[i] = Character.toLowerCase(s[i]);
            solve(s, i + 1);

            s[i] = Character.toUpperCase(s[i]);
            solve(s, i + 1);

        } else {
            solve(s, i + 1);
        }
    }

    public static void main(String[] args) {
        solve("a1b".toCharArray(), 0);
    }
}