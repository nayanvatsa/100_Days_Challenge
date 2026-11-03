import java.util.Scanner;
public class swap{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number1: ");
      int n = sc.nextInt();
      System.out.println("Enter number2: ");
      int m = sc.nextInt();
      
      System.out.println("Before swapping: m = " + m + ", n = " + n);

        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}
