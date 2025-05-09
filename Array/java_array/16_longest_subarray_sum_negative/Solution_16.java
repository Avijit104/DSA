import java.util.HashMap;

public class Solution_16 {

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Optimal solution
    public int longestSubarraySumNegative(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int length = 0;
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
            if (sumArr > k) {
                int key = sumArr - k;
                if (hashMap.get(key) != null) {
                    length = max(length, i - hashMap.get(key));
                }
            }
            if (sumArr == k) {
                length = max(length, i + 1);
            }
            if (hashMap.get(sumArr) == null) {
                hashMap.put(sumArr, i);
            }

        }
        return length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, -1, 1, 1, 4, 2, 3 };
        // int arr[] = { -1, 1, 1 };
        int k = 3;
        // int k = 1;
        Solution_16 s = new Solution_16();
        System.out.println(s.longestSubarraySumNegative(arr, k));
    }

}
