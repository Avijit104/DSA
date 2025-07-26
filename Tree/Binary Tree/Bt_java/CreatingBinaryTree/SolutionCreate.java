class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SolutionCreate {
    static int index = -1;

    BinaryTreeNode CreateBinaryTree(int[] preOrder) {
        index++;
        if (preOrder[index] == -1) {
            return null;
        }
        BinaryTreeNode bt = new BinaryTreeNode(preOrder[index]);
        bt.left = this.CreateBinaryTree(preOrder);
        bt.right = this.CreateBinaryTree(preOrder);
        return bt;
    }

    public static void main(String[] args) {
        int preOrder[] = { 1, 2, 6, -1, -1, -1, 3, 4, -1, -1, 5, -1, -1 };
        SolutionCreate s = new SolutionCreate();
        BinaryTreeNode root = s.CreateBinaryTree(preOrder);
        System.out.println(root.right.right.data);

    }
}