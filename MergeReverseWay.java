import java.util.Scanner;
public class MergeReverseWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
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
          int i=n-1, j=m-1, k=(m+n)-1;
       
        while (i>=0 && j>=0){
            if(b[j]<a[i]){
                c[k--] = a[i--];
            }
            else c[k--]= b[j--];
        }
         while (i>=0){
        c[k--] = a[i--];
    }
    while (j>=0){
        c[k--] = b[j--];
    }
      
       for (int ele : c){
        System.out.print(ele+" ");
       }
       System.out.println();
    }
}
