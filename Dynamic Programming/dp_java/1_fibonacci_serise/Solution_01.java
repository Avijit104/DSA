import java.util.Arrays;

class Solution_01 {
    int dpFib(int n, int[] dp) {
        if (n <= 1) {
            return n;

        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = dpFib(n - 1, dp) + dpFib(n - 2, dp);
        return dp[n];
    }

    public int fib(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return dpFib(n, dp);

    }

    // Optimal Solution
    public int fibOptimal(int n) {
        if (n <= 1) {
            return n;
        }
        int curr = 0;
        int prev = 0;
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {
            curr = prev + prev1;
            prev = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 6;
        Solution_01 s = new Solution_01();
        System.out.println("result is " + s.fib(n));
        System.out.println(s.fibOptimal(n));
    }
}