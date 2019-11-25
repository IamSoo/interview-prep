package common;

public class ReverseLinkedList {


    public ListNode reverseNode(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.nextNode;
            prev = head;
            head = next;
        }
        return prev;

    }



    class ListNode{
        int val;
        ListNode nextNode;
        ListNode(int x) { val = x;}
    }

}
