import java.util.Scanner;
public class NegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n =sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter the Elements: ");
            for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Printing
        System.out.println("Negative Numbers: ");
        for (int i=0; i<n; i++){
            if (arr[i]<0){
            System.out.print(arr[i]+" ");
            }
        }
    }
}
