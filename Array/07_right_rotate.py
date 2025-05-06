class Solution:
    def rightRotate(self, nums,k):
        k = k%len(nums)
        temp = nums[len(nums)-k:len(nums)]
        print(temp)
        for i in range(len(nums) -k-1, -1, -1):
            nums[i+k] = nums[i]
        for i in range(len(temp)):
            nums[i] = temp[i]
        
    #spliting and reverse technique will be same as left rotation    
    
s = Solution()
k=4
arr = [1,2,3,4,5]
s.rightRotate(nums=arr, k=k)
print(arr)