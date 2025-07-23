class Solution:

    def fib(self, n: int) -> int:
        dp = [-1 for i in range(n+1)]
        def dpFib(n, dp):

            if n <= 1:
 
                return n
            if dp[n] != -1:
                return dp[n]
            dp[n] = dpFib(n-1, dp) + dpFib(n-2, dp)
            return dp[n]
        return dpFib(n, dp)

s = Solution()
n = 6
print(s.fib(n=n))