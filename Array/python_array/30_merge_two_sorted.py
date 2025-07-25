from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        temp = nums1[: m]
        i = j =  k = 0
        while i < m and j < n:
            if temp[i] >= nums2[j]:
                nums1[k] = nums2[j]
                j += 1
            elif temp[i] < nums2[j]:
                nums1[k] = temp[i]
                i += 1
            k += 1
        while j<n:
            nums1[k] = nums2[j]
            j+= 1
            k += 1
        while i<m:
            nums1[k] = temp[i]
            i+=1
            k+=1

s = Solution()
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
s.merge(nums1, m, nums2, n)
print(nums1)