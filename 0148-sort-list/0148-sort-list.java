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
    public ListNode sortList(ListNode head) {
        List<Integer> sort = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            sort.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(sort);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = sort.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}