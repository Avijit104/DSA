public class Solution{
   public int largestElement(int[] nums, int length) {
      int max = -1;
      for (int i = 0; i < length; i++){
        if (nums[i]>max) {
            max = nums[i];
        }
      }
      return max;
   }

   public static void main(String[] var0) {
      int[] arr = new int[]{1, 2, 3, 4, 5, 6, 10};
      Solution s = new Solution();
      System.out.println(s.largestElement(arr, arr.length));
   }
}
