import java.util.Scanner;

public class CategorizeBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();

        long volume = (long) length * width * height;

        boolean bulky = (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000);
        boolean heavy = (mass >= 100);

        if (bulky && heavy)
            System.out.println("Both");
        else if (bulky)
            System.out.println("Bulky");
        else if (heavy)
            System.out.println("Heavy");
        else
            System.out.println("Neither");
    }
}