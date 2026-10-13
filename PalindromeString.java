import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        int i=0;
        int j=str.length()-1;
        boolean found = true;
        while (i<j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1 != ch2){
                found = false;
                break;
            }
            i++;
            j--;
        }
        if (found) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
