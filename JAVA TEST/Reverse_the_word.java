import java.util.Scanner;

public class Reverse_the_word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Remove extra spaces and split into words
        String[] words = s.trim().split("\\s+");

        // Print words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}