class Solution:
    
    # Optimal Solution using kadane's algorithm
    def maxSubarraySumOptimal(self, arr):
        maxSum = -100000
        sumArr = 0
        for i in arr:
            sumArr = sumArr + i
            if sumArr < 0:
                sumArr = 0
            if sumArr > maxSum:
                maxSum = sumArr
        return maxSum
            


s = Solution()
arr = [-2,-3,4,-1,-2,-1,5,3]
print(s.maxSubarraySumOptimal(arr))