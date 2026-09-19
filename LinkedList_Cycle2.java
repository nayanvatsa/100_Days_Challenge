public class Solution {
    public ListNode detectCycle(ListNode head) {
        if ( head == null  ||  head.next==null) return null ;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while (fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) 
            break;
            
        }
        if (fast==null || fast.next==null) return null;
        ListNode t1 = head;
        ListNode t2 = slow;
        while (t1!=t2) {
            t1 = t1.next;
            t2 = t2.next;
            if (t1==t2) return t1;
        }
        return t1;
    }
    
}
