from typing import Optional
import LinkedList
class Solution:
    def removeNthFromEnd(self, head: Optional[LinkedList.Node], n: int) -> Optional[LinkedList.Node]:
        res = LinkedList.Node(0, head)
        dummy = res

        for _ in range(n):
            head = head.next
        
        while head:
            head = head.next
            dummy = dummy.next
        
        dummy.next = dummy.next.next

        return res.next

s = Solution()
l = LinkedList.LinkedList()
arr = [1,2,3,4,5]
n = 2
head = l.createLinkedlist(arr)
l.traverseLinkedList(head)
res = s.removeNthFromEnd(head, n)
l.traverseLinkedList(res)
