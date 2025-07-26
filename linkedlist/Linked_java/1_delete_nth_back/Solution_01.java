
public class Solution_01 {
    public Node deleteNthNodeBack(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node res = dummy;
        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        while (head) {
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return res.next;
    }
}
