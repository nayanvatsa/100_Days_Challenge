class Solution {
      public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr!= null){
            fwd= curr.next;
            curr.next=prev;
            prev =curr;
            curr = fwd;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
 
     /*  ListNode slow = head;
       ListNode fast = head.next;
       while (fast != null && fast.next != null) {
       slow = slow.next;
       fast = fast.next.next;
} */
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        a = reverse(a);
        ListNode p1 = head;
        ListNode p2 = a;

        while (p2 != null) {
            if (p1.val != p2.val)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
