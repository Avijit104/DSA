
public class Solution_29 {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (int) (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (target > nums[mid]) {
            return mid + 1;
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 2;
        Solution_29 s = new Solution_29();
        int res = s.searchInsert(nums, target);
        System.out.println(res);
    }
}
