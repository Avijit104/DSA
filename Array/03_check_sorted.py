class Solution:
    
    # Optimal Solution
    def checkSorted(self, nums):
        flag = False
        for i in range(0, len(nums) - 1):
            if nums[i] <=  nums[i+1]:
                flag = True
            else:
                flag = False
                break
        return flag
        
        
arr = [1,2,2,3,3,4]
arr2 = [1,2,1,3,4]
s = Solution()
print(s.checkSorted(arr))
print(s.checkSorted(arr2))