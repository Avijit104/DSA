class Solution:
    def isPalindrome(self, x: int) -> bool:
        temp = str(x)[::-1]
        if str(x) == temp:
            return True
        else:
            return False
        
s = Solution()
res = s.isPalindrome(123)
print(res)