
from typing import List, Optional
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
        
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        def bst(arr, left, right):
            mid = (left + right) // 2
            if left > right:
                return None
            t = TreeNode(arr[mid])
            t.left = bst(arr, left, mid-1)
            t.right = bst(arr, mid+1, right)
            return t
        return bst(nums, 0, len(nums)-1)
    
    
s = Solution()
arr = [-10,-3,0,5,9]
res = s.sortedArrayToBST(arr)
print("Bst root is : ", res.val)