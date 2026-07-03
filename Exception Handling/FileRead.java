import java.io.*;

public class FileRead {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("sample.txt");

            int ch = file.read();
            System.out.println((char) ch);

            file.close();
        }
        catch (Exception e) {
            System.out.println("File Not Found");
        }
    }
}