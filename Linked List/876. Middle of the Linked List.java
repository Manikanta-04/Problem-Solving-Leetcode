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
    public ListNode middleNode(ListNode head) {
     ListNode temp=head;
     int c=0;
     int t;
     while(temp!=null){
        c++;
        temp=temp.next;
     }
    t=(c/2)+1; 
     
     int c1=0;
     ListNode temp1=head;
     ListNode res=null;
     while(temp1!=null){
        c1++;
        if(c1==t) {
            res=temp1;
            break;}
        temp1=temp1.next;
     }
    return res;
    }
}