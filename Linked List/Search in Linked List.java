/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        if(head.data==key) return true;
        Node temp=head;
        while(temp.next!=null) {
            if(temp.data==key) return true;
            temp=temp.next;
        }
        if(temp.data==key) return true;
        return false;
        
    }
}