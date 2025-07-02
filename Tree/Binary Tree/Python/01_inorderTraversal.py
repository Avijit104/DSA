
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        curr = root
        l = []
        ans = []
        while True:
            if curr:
                while(curr):
                    l.append(curr)
                    curr = curr.left
            else:
                if(len(l)==0):
                    break
                temp = l.pop()
                ans.append(temp.val)
                curr = temp.right
        return ans