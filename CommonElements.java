import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter "+n+" Elements:");
        for (int i = 0; i < n; i++) {
             a[i] = sc.nextInt();
        }
      System.out.print("Enter m: ");
        int m =sc.nextInt();
        int[] b= new int[m];
        System.out.println("Enter "+m+" Elements:");
        for (int i = 0; i < m; i++) {
             b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while (i<n && j<m){
            if(a[i]==b[j]){  // m+n tc
                arr.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j]) i++;
            else j++;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
