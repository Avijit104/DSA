public class Solution_04 {
    public int removeDuplicate(int[] nums, int length) {
        int j = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;

            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 4, 4, 5 };
        Solution_04 s = new Solution_04();
        int len = s.removeDuplicate(arr, arr.length);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("length is " + len);
    }
}