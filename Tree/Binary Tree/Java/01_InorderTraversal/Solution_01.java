import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution_01 {
    ArrayList<Integer> res = new ArrayList<>();

    ArrayList InorderTraversal(Node root) {

        if (root == null) {
            return null;
        }
        InorderTraversal(root.left);
        res.add(root.data);
        InorderTraversal(root.right);
        return res;
    }

    public static void main(String[] args) {

    }

}