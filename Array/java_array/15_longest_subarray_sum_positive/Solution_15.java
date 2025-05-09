public class Solution_15 {
    public int longestSubarraySum(int[] arr, int k) {
        int length = 0;
        int sumArr;
        for (int i = 0; i < arr.length; i++) {
            sumArr = 0;
            for (int j = i; j < arr.length; j++) {
                sumArr = sumArr + arr[j];
                if (sumArr == k) {
                    if (j - i + 1 > length) {
                        length = j - i + 1;
                    }
                    break;
                }
                if (sumArr > k) {
                    break;
                }

            }
        }
        return length;
    }

    // Optimal Solution
    public int longestSubarraySumOptimal(int[] arr, int k) {
        int right = 0;
        int left = 0;
        int sumArr = arr[right];
        int length = 0;
        while (right < arr.length) {
            right++;
            if (right < arr.length) {
                sumArr = sumArr + arr[right];
            }
            while (sumArr > k) {
                sumArr = sumArr - arr[left];
                left++;

            }
            if (sumArr == k) {
                if (right - left + 1 > length) {
                    length = right - left + 1;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;
        Solution_15 s = new Solution_15();
        System.out.println(s.longestSubarraySum(arr, k));
        System.out.println(s.longestSubarraySumOptimal(arr, k));
    }
}
