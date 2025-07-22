from typing import List
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        left  = 0
        right = len(nums)-1
        mid = 0
        if target < nums[0]:
            return 0
        if target > nums[len(nums)-1]:
            return len(nums)
        while left <= right:
            mid = int((left+right)//2)
            print(mid)
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                right = mid -1
            else:
                left = mid + 1


        if target > nums[mid]:
            return mid+1
        else:
            return mid
        
s  = Solution()
nums = [1,3,5,6]
target = 5
res = s.searchInsert(nums, target)
print(res)
