
from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        cnt = 0
        j = len(nums)-1
        for i in range(len(nums)-1, -1, -1):
            if nums[i] == val:
                nums[i], nums[j] = nums[j], nums[i]
                cnt += 1
                j -= 1
        return len(nums)- cnt

s = Solution()
nums = [3,2,2,3]
val = 3
res = s.removeElement(nums, val)
print(res)