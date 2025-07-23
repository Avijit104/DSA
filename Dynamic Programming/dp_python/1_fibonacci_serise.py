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
    
    # Optimal Solution
    def fibOptimal(self, n):
        prev = 0
        prev1 = 1
        for i in range(2, n+1):
            curr = prev +prev1
            prev, prev1 = prev1, curr
        return curr
    
s = Solution()
n = 6
print(s.fib(n=n))
print(s.fibOptimal(n))