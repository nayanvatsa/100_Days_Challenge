import java.util.Scanner;
public class MaxElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for ( int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i=0; i<n; i++){
        if (arr[i]>max){
            max = arr[i];
        }
        }  
           System.out.println("Maximum Element is: "+max);
        }  
    }
