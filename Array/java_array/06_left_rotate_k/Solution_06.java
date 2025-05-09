public class Solution_06 {
    void reverse(int[] arr, int left, int right) {
        while (right > left) {
            int temp;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void leftRotateK(int[] arr, int length, int k) {
        k = k % length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, length - 1);
        reverse(arr, 0, length - 1);
    }

    public static void main(String[] args) {
        int k = 4;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Solution_06 s = new Solution_06();
        s.leftRotateK(arr, arr.length, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
