class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCreate {
    public Node createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public void traverseLinkedList(Node head) {
        while (head != null) {
            System.out.println("Node value: " + head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCreate l = new LinkedListCreate();
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = l.createLinkedList(arr);
        l.traverseLinkedList(head);
    }
}
