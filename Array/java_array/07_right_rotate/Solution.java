class Solution {
    public void rightRotateOne(int[] arr, int length) {
        int temp = arr[length - 1];
        for (int i = length - 2; i > -1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Solution s = new Solution();
        s.rightRotateOne(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
