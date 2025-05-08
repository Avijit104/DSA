public class Solution {
    public void moveZerosEnd(int[] arr, int length) {
        int j = 0;
        int temp;
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 0, 3, 0, 4 };
        Solution s = new Solution();
        s.moveZerosEnd(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
