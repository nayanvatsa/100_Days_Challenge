import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseQueue{
  public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      Stack<Integer> st = new Stack<>();
      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
    System.out.println(q);
    int n = q.size();
    for (int i=0; i<n; i++){
    int rr = q.remove();
    st.push(rr);
    }
    while(st.size()!=0){
    q.add(st.pop());
    }
     System.out.println(q);
    
  }
}
