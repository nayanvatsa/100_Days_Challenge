import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, j=0, k=0;
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Elements: ");
        int[] a= new int[n];
        for (int s=0; s<n; s++){
            a[s]=sc.nextInt();
        }
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter "+m+" Elements: ");
        int[] b= new int[m];
        for (int t=0; t<m; t++){
            b[t]=sc.nextInt();
        }
        int[] c = new int[m+n];
       
        while (i<n && j<m){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }
            else c[k++]= b[j++];
        }
         while (i<n){
        c[k++] = a[i++];
    }
    while (j<m){
        c[k++] = b[j++];
    }
      
       for (int ele : c){
        System.out.print(ele+" ");
       }
       System.out.println();
    }
}
