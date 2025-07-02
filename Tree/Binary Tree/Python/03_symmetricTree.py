class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def isSame(p, q):
            if not p and not q:
                print("and")
                return True
            if not p or not q:
                print("or")
                return False
            if p.val != q.val :
                print("this 1")
                return False


            return (isSame(p.left, q.right) and isSame(p.right, q.left))

        return isSame(root.left, root.right)
        