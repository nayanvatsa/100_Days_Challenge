class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode fwd = null;
        ListNode prev = null;
        ListNode temp = head;
        ListNode leftprev =null;
        for (int i =1; i<left; i++){
        leftprev = curr;
        curr = curr.next;
        }
        ListNode leftnode = curr;
        for (int j =1; j<=right; j++) temp = temp.next;
        while (curr!= temp){
            fwd= curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        leftnode.next = curr;
        if(leftprev!=null)   leftprev.next = prev;
        else head = prev;
        return head;
    }
}
