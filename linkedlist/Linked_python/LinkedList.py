class Node:
    def __init__(self, val, next = None):
        self.val = val 
        self.next = next
    
    
    
class LinkedList:
    def createLinkedlist(self, arr):
        n = Node(arr[0])
        head = n
        for i in arr[1:]:
            newNode = Node(i)
            n.next = newNode
            n = n.next
        return head
    
    def traverseLinkedList(self, head):
        while head != None:
            print(head.val)
            head = head.next 

