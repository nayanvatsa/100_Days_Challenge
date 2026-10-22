import java.util.Scanner;
public class BubbleSort1 {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+"elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        // for (int i = 0; i < n-1; i++) {  // more good as no.of ops is less
        //    // for (int j=0; j< n-1; j++){  
        //         for (int j=0; j<n-1-i; j++){
        //         if (arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
         for (int i=0; i<n-1; i++){
            boolean isSorted = true;
            for (int j=0; j<n-1; j++){
                if (arr[j]> arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted==true) break; 
            for (int k=0; k<n-1-i; k++){
                 if (arr[k] > arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        print(arr);
        
    }
            
         
}
     
