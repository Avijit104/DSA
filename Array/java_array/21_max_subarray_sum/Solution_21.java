class Solution_21 {

    // Optimal Solution using kadane's algorithm
    public int maxSubarraySumOptimal(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sumArr = 0;
        for (int i : arr) {
            sumArr = sumArr + i;
            if (sumArr < 0) {
                sumArr = 0;

            }
            if (sumArr > maxSum) {
                maxSum = sumArr;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Solution_21 s = new Solution_21();
        System.out.println(s.maxSubarraySumOptimal(arr));
    }
}