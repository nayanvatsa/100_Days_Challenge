class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

    
        ListNode temp = head;

        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }

   
        ListNode curr = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}
