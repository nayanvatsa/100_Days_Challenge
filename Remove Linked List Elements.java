class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
       ListNode dummy = new ListNode(-2);
       ListNode t1 = dummy;
         t1.next = head;
       while(t1.next!=null){
      // if(t1.next.val==val){
      //  t1.next = t1.next.next;
  //  }
  //  else{
  //     t1 = t1.next;
    //}
    if(t1.next.val!=val){
        t1 =t1.next;
    }
    else{
        t1.next=t1.next.next;
    }
    }    
    return dummy.next;
    }
}
