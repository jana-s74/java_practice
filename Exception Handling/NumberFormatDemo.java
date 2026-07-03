public class NumberFormatDemo {

    public static void main(String[] args) {

        try {
            String str = "ABC";
            int num = Integer.parseInt(str);

            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}