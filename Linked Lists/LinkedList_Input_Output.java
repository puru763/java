import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedList_Input_Output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();

        Node head = null;
        Node temp = null;
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
                temp = newnode;
            } else {
                temp.next = newnode;
                temp = newnode;
            }
        }

    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
