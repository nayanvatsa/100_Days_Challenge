import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class ReverseK_Elements{
 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Queue<Integer>q = new LinkedList<>();
    Stack<Integer>st = new Stack<>();
    System.out.print("Enter the size of queue: ");
    int n = sc.nextInt();
    System.out.print("Enter the elements: ");
    for (int i=1; i<=n;i++){ 
        int element = sc.nextInt();
        q.add(element);
    }
    System.out.print("Enter no.First K element: ");
    int k = sc.nextInt();
    for (int i=0;i<k; i++){
    int rem = q.remove();
        st.push(rem);
    }
    while(!st.isEmpty()){
    int pp =st.pop();
    q.add(pp);
    }
   
    for (int i=0; i<(n-k); i++){
    int re =  q.remove();
        q.add(re);
    }
    System.out.println(q);
 }

}
