 class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int x) {
        val = x;
    }
}

class ReverseLinkedListSolution {
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ReverseLinkedListSolution solution = new ReverseLinkedListSolution();
        ListNode result = solution.reverseLinkedList(head);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
