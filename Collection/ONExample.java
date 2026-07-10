import java.util.Scanner;

public class ONExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}