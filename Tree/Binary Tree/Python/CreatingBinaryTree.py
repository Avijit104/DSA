class BinaryTreeNode:
    def __init__(self, data):
        self.data = data 
        self.left = None
        self.right = None
        
        
        
class BinaryTree:
    
    # creating binary tree 
    ind = -1
    def createNode(self, preOrder):
        self.ind += 1
        if preOrder[self.ind] == -1:
            return None
        b1 = BinaryTreeNode(preOrder[self.ind])
        b1.left = self.createNode(preOrder)
        b1.right = self.createNode(preOrder)
        return b1
    
    # pre-order traversal
    def preOrderTravel(self, root):
        if(root == None):
            return
        print(root.data, end=" ")
        self.preOrderTravel(root.left)
        self.preOrderTravel(root.right)
        
    # in-order traversal
    def inOrderTraversal(self, root):
        if(root ==  None):
            return
        self.inOrderTraversal(root.left)
        print(root.data, end=" ")
        self.inOrderTraversal(root.right)
        
    def postOrderTraversal(self, root):
        if(root == None):
            return
        self.postOrderTraversal(root.left) 
        self.postOrderTraversal(root.right)
        print(root.data, end = " ")   
        
    # level order traversal 
    def levelOrderTraversal(self, root):
        queue = [root]
        queue.append(None)
        front = 0
        while(len(queue) > front):
            # print(front)
            if(queue[front] != None):
                print(queue[front].data, end=" ")
                if(queue[front].left != None):
                    queue.append(queue[front].left)
                if(queue[front].right != None):
                    queue.append(queue[front].right)
            else:
                if(front < len(queue)-1):
                    print()
                    queue.append(None)
                else: 
                    break
            front +=1
        print(queue)
    
    
preOrder = [1,2,6, -1, -1,-1,3,4,-1,-1,5,-1,-1]
bt = BinaryTree()
root =  bt.createNode(preOrder)
bt.preOrderTravel(root)
print()
bt.inOrderTraversal(root)
print()
bt.postOrderTraversal(root)
print()
bt.levelOrderTraversal(root)
print(( 0== 0) + 1)