class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        sum = root.val
        def calSum(root):
            nonlocal sum
            if not root:
                return 0
            leftSum  = max(0,calSum(root.left))
            rightSum = max(0,calSum(root.right))
            temp = leftSum + rightSum + root.val
            print(sum)
            if(temp > sum):
                sum = temp
                print( sum)
            return max(leftSum, rightSum) + root.val

        calSum(root)
        return sum