package string.stringbuffer;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.insert(4," Language");

        System.out.println(sb);
    }
}