class Solution:
    
    # OPtimal Solution
    def moveAllZeros(self, nums):
        i = 0
        for j in range(len(nums)):
            if nums[j] != 0:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1

s = Solution()
arr = [1,0,2,3,2,0,0,4,5,1]
s.moveAllZeros(arr)
print(arr)