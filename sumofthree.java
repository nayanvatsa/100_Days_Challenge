import java.util.Scanner;
public class sumofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double sum = a+b+c;
        System.out.print("Sum of three numbers is: ");
        System.out.println(sum);
    }
}