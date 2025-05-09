class Solution:
    
    # Optimal Solution
    def largestElement(self, nums):
        largest = nums[0]
        for i in nums:
            if i > largest:
                largest = i
                
        return largest
    

arr = [1,2,5,9,7]
s = Solution()
print(s.largestElement(arr))