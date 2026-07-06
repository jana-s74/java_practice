import java.sql.*;

public class java_sql1 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "1123";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}