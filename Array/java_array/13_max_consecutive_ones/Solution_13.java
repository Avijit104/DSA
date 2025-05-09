public class Solution_13 {

    // Optimal Solution
    public int consecutiveOnes(int[] arr) {
        int maxCnt = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                }
                cnt = 0;
            }
        }
        if (cnt > maxCnt) {
            maxCnt = cnt;
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        Solution_13 s = new Solution_13();
        System.out.println(s.consecutiveOnes(arr));
    }
}
