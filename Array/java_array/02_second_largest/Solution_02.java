public class Solution_02 {

    // Optimal Solution
    public int secondLargest(int[] nums, int length) {
        int sLargest = -1;
        int largest = -1;
        for (int i = 0; i < length; i++) {
            if (nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            } else if ((nums[i] < largest) && (nums[i] > sLargest)) {
                sLargest = nums[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 5 };
        Solution_02 s = new Solution_02();
        System.out.println(s.secondLargest(arr, arr.length));
    }

}
