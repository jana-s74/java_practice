import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Name: jana\n");
            writer.write("Age: 18\n");
            writer.write("Phone: 8940333201");

            writer.close();

            System.out.println("Data written to file");

        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}