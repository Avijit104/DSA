class Solution:
    def leftRotateKSplit(self, nums, k):
        k = k % len(nums)
        index = 0
        if k == len(nums) or k == 0:
            return nums
        temp1 = nums[0:k]
        temp2 = nums[k:len(nums)]
        for i in temp2:
            nums[index] = i
            index += 1
        for i in temp1:
            nums[index] = i
            index += 1
            
    # Optimal Solution
    def leftRotationKOptimal(self, nums, k):
        nums = nums[0:k:-1]
        nums = nums[k:len(nums):-1]
        nums = nums[::-1]
            
s = Solution()
arr = [1,2,3,4,5,6,7]
k = 2
s.leftRotateKSplit(arr, k)
print(arr)
        
s.leftRotationKOptimal(arr, k)
print(arr)