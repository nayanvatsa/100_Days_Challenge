import java.util.Scanner;
public class SegregateZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        }
        int nz=0; //no =0;//
        for (int ele : arr){
            if (ele == 0) nz++;
           // else no++;//
        }
        // for (int j=1; j<=nz; j++){       //third way of simple 
        //     System.out.print(0+" ");

        // }// Yes, your logic is correct if your goal is strictly to print the segregated
        // result and you are absolutely certain the user will only enter 0s and 1s..
        
        //  for (int j=1; j<=no; j++){
        //     System.out.print(1+" ");
        // }     //
        for (int i =0; i< n; i++){
            if(i<nz){
            arr[i] = 0;  // first way
            }
            else {
                arr[i] =1;
            }
        } 
       /*  TWO PASS SOLUTION
       for (int i =0; i<nz; i++){
        arr[i]=0;
        }
        for (int i =nz; i<n; i++){  second wAy
        arr[i]=1;
        }
        */
       for (int ele : arr){
        System.out.print(ele +" ");
       }
       
    }
}
