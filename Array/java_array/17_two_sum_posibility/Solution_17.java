class Solution_17 {
    public boolean twoSumPosibility(int[] arr, int taraget) {
        for (int i = 0; i < arr.length; i++) {
            int difference = taraget - arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == difference) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimal Solution
    public boolean twoSumPosibilityOptimal(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;
        Solution_17 s = new Solution_17();
        System.out.println(s.twoSumPosibility(arr, target));
        System.out.println(s.twoSumPosibilityOptimal(arr, target));
    }
}