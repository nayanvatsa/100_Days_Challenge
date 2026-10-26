
import java.util.Scanner;

public class SimpleInterest { 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal: ");
    double p = sc.nextDouble();
    System.out.print("Enter rate of interest: ");
    double r = sc.nextDouble();
    System.out.print("Enter time in years: ");
    double t = sc.nextDouble();
    double interest = (p*r*t)/100;
    System.out.print("Interest is: "); 
    System.out.println(interest);
}
}
