import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLUH {

    public static void main(String[] args) throws Exception {

        // Step 1: Create URL object with the HTTP link
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

        // Step 2: Open an HttpURLConnection from the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Step 3: Set the request method (GET, POST, etc.)
        connection.setRequestMethod("GET");

        // Step 4: Get the response code
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code : " + responseCode);
        System.out.println("Host          : " + url.getHost());
        System.out.println("Protocol      : " + url.getProtocol());
        System.out.println("Path          : " + url.getPath());

        // Step 5: Read the response body
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("\nResponse Body:");
            System.out.println(response.toString());
        } else {
            System.out.println("GET request failed!");
        }

        // Step 6: Disconnect
        connection.disconnect();
    }

}