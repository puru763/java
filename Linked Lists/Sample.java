import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the linked list: ");
        int n = scanner.nextInt();

        Node head = null;
        Node temp = null;

        System.out.println("Enter the data for each node: ");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
                temp = newnode;
            } else {
                temp.next = newnode;
                temp = newnode;
            }
        }

        printLinkedList(head);

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
