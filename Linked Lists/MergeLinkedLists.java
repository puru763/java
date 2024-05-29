import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class MergeLinkedLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the first linked list: ");
        int n1 = sc.nextInt();
        System.out.println("enter  nodes");

        Node head1 = null;
        Node temp1 = null;
        for (int i = 0; i < n1; i++) {
            int data = sc.nextInt();
            Node newnode = new Node(data);

            if (head1 == null) {
                head1 = newnode;
                temp1 = newnode;
            } else {
                temp1.next = newnode;
                temp1 = newnode;
            }

        }

        System.out.println("Enter the number of nodes in the first linked list: ");
        int n2 = sc.nextInt();
        System.out.println("enter  nodes");

        Node head2 = null;
        Node temp2 = null;
        for (int i = 0; i < n2; i++) {
            int data = sc.nextInt();
            Node newnode = new Node(data);

            if (head2 == null) {
                head2 = newnode;
                temp2 = newnode;
            } else {
                temp2.next = newnode;
                temp2 = newnode;
            }

        }

        printLinkedList(head1);
        printLinkedList(head2);

        System.out.println("Merged Linked List: ");
        Node mergedList = mergeTwoLinkedLists(head1, head2);
        System.out.println(mergedList);
    }

    public static Node mergeTwoLinkedLists(Node l1, Node l2) {

        Node dummyNode = new Node(-1);
        Node temps = dummyNode;

        while (l1 != null && l2 != null) {
            if (l1.data > l2.data) {
                temps.next = l2;
                l2 = l2.next;
            } else {
                temps.next = l1;
                l1 = l1.next;
            }
            temps = temps.next;
        }

        if (l1 != null) {
            temps.next = l1;
        } else {
            temps.next = l2;
        }

        return dummyNode.next;

    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
