
public class Solution_28 {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        int j = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                cnt++;
                j--;
            }
        }
        return nums.length - cnt;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 3;
        Solution_28 s = new Solution_28();
        int res = s.removeElement(nums, val);
        System.out.println(res);
    }
}
