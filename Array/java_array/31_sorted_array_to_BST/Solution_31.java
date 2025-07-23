
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution_31 {
    TreeNode bst(int arr[], int left, int right) {
        int mid = (int) (left + right) / 2;
        if (left > right) {
            return null;
        }
        TreeNode t = new TreeNode(arr[mid]);
        t.left = bst(arr, 0, mid - 1);
        t.right = bst(arr, mid + 1, right);
        return t;
    }

    public TreeNode sortedArrayToBst(int[] arr) {
        return bst(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { -10, -3, 0, 5, 9 };
        Solution_31 s = new Solution_31();
        TreeNode res = s.sortedArrayToBst(arr);
        System.out.println("Root node is : " + res.val);
    }
}