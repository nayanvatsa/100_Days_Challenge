
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        double sq = n*n;
        System.err.print("Square of entered number is: ");
        System.err.println(sq);
    }
}
