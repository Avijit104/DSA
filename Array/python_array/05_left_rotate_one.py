class Solution:
    
    # Optimal Solution
    def leftRotateOne(self, nums):
        temp = nums[0]
        for i in range(1, len(nums)):
            nums[i-1] = nums[i]
        nums[len(nums) - 1] = temp
    
arr = [1,2,3,4,5]
s = Solution()
s.leftRotateOne(arr)
print(arr)
                