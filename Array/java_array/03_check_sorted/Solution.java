public class Solution {
    public boolean checkSorted(int[] nums, int length){
        for(int i = 1; i<length; i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,8,4,5};
        Solution s = new Solution();
        System.out.println(s.checkSorted(arr, arr.length));

    }
}
