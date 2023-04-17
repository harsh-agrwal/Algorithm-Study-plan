/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> arr = new ArrayList<>();
        while (head != null)
        {
            arr.add(head);
            head = head.next;
        }
        if (arr.size() == 0 || n > arr.size())
            return null;
        if (n == arr.size())
            return arr.get(0).next;
        arr.get(arr.size() - n - 1).next = arr.get(arr.size() - n).next;
        return arr.get(0);
    }
}
