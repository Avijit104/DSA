class Solution_07 {
    public void rightRotateOne(int[] arr, int length) {
        int temp = arr[length - 1];
        for (int i = length - 2; i > -1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    // Optimal Solution
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

    public void rightRotateK(int[] arr, int length, int k) {
        k = k % arr.length;
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Solution_07 s = new Solution_07();
        s.rightRotateOne(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("k rotation");
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        s.rightRotateK(arr1, arr1.length, k);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
