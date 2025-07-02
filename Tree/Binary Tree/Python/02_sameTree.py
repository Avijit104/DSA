class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        res =[]
        def inorder(p):
            if p == None:
                return
            res.append(p.val)
            if p.left != None:
                inorder(p.left)
            else:
                res.append(None)
            if p.right != None:
                inorder(p.right)
            else:
                res.append(None)
           
        inorder(p)
        pres = res
        print(pres)
        res = []
        inorder(q)
        qres = res
        print(qres)
        if(pres == qres):
            return True
        else:
            return False
        
        # optimal solution
    def isSameTreeOptimal(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        
        # recursive step
        return (
            self.isSameTree(p.left,  q.left) and
            self.isSameTree(p.right, q.right)
        )