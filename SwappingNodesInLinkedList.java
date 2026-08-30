class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t1 = head;
        ListNode t2 = head;
        for (int i =0; i<k; i++){
            t1 = t1.next;
        }
        while (t1!= null){
            t1 = t1.next;
            t2= t2.next;
        }
     t1 = head;
     for (int i =1; i<k ; i++){
        t1 = t1.next;
     }
     int temp = t1.val;
     t1.val = t2.val;
     t2.val = temp;

     return head;

    }
}
