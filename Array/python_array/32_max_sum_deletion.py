from typing import List

class Solution:
    def maxSum(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        s = set() 
        add = 0
        for i in nums:
            if i not in s and i > 0:
                s.add(i)

        if len(s) == 0:
            add = nums[0]
            for i in nums:
                if i > add:
                    add = i
        else:
            for x in s:
                add = add + x
        return add
    
                
    # Optimal Solution
    def maxSumOptimal(self, nums: List[int]) -> int:
        if all(n < 0 for n in nums):
            return max(nums)
        
        unique = set(nums)
        return sum(n for n in unique if n > 0)
    
s = Solution()
nums = [1,2,-1,-2,1,0,-1]
res = s.maxSum(nums)
print(res)
res = s.maxSumOptimal(nums)
print(res)