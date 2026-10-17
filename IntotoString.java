import java.util.Scanner;
public class InttoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String s = "";   1st method
        // s += n;
        String s = Integer.toString(n); // 2nd method
        System.out.println(s);
    }
}
