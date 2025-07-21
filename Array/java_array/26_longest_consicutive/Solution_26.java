import java.util.Arrays;

public class Solution_26 {
    int longestConsicutive(int[] arr) {
        int small = Integer.MIN_VALUE;
        int cnt = 1;
        int length = 0;
        Arrays.sort(arr);
        for (int i : arr) {
            if (i - 1 == small) {
                cnt++;
                small = i;
            } else if (i - 1 != small) {
                cnt = 1;
                small = i;
            }
            if (length < cnt) {
                length = cnt;
            }
        }
        return length;

    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 3, 100, 1, 102, 100, 2, 5, 103 };
        Solution_26 s = new Solution_26();
        int res = s.longestConsicutive(arr);
        System.out.println("result = " + res);
    }

}
