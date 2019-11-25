package common;

public class AddTwoNumbers {



    public  ListNode addNumbers(ListNode l1, ListNode l2,int carry) {
        if (l1 == null && l2 == null) return carry == 0 ? null :  new ListNode(carry);
        int sum =  (l1==null ? 0 : l1.val) +  (l2==null ? 0 : l2.val) + carry;
        ListNode node = new ListNode( sum % 10);
        node.next =  addNumbers(l1.next,l2.next, sum/10);

        return node;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
