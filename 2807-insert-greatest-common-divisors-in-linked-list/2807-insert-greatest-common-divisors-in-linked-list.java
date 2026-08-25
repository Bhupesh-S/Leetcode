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
    static int gcd(int n1,int n2){
        if(n2==0)    return n1;
        return gcd(n2,n1%n2);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode h=head;
        while(h!=null && h.next!=null){
            ListNode t1=h;
            int gcd=gcd(h.val,h.next.val);
            ListNode temp=new ListNode(gcd);
            temp.next=h.next;
            h.next=temp;
            h=temp.next;
        }
        return head;
    }
}