class Solution:
    def removeDuplicateUsingSet(self, nums):
        s = set()
        j = 0
        for i in nums:
            s.add(i)
        for i in s:
            nums[j] = i
            j += 1
        return i
            
        
    # optimal solution
    def removeDuplicatOptimal(self, nums):
        j = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]:
                nums[j] = nums[i]
                j += 1
        return j
    
    
s = Solution()


arr = [1,1,2,2,2,3,3]
print(s.removeDuplicateUsingSet(arr))
print(arr)


arr = [1,1,2,2,2,3,3]
print(s.removeDuplicatOptimal(arr))
print(arr)