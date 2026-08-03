import java.util.Scanner;

public class ReverseWordsInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the complete sentence
        String sentence = sc.nextLine();

        // Remove extra spaces and split into words
        String[] words = sentence.trim().split("\\s+");

        // Print words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i]);

            // Avoid extra space after the last word
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}