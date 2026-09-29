class Solution {
    public void deleteNode(ListNode tar) {
        // steps
        tar.val = tar.next.val;
        tar.next = tar.next.next;
    }
}
