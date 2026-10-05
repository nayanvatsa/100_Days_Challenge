// SIMPLE APPROACH

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        }
        for (int i=n-1; i>= 0; i--){
            System.out.print(arr[i]+" ");
        }
    //     int i=2;           
    //     int j= n-3;           
    //    while (i<j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     i++;
    //     j--;
    //    }
    //    for (int ele: arr){
    //     System.out.print(ele + " ");
    //    }
    }
}
