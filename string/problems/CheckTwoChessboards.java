import java.util.Scanner;

public class CheckTwoChessboards {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c1 = sc.next();
        String c2 = sc.next();

        int x1 = c1.charAt(0) - 'a';
        int y1 = c1.charAt(1) - '1';

        int x2 = c2.charAt(0) - 'a';
        int y2 = c2.charAt(1) - '1';

        if ((x1 + y1) % 2 == (x2 + y2) % 2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}