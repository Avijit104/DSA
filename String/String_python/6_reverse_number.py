class Solution:
    def reverse(self, x: int) -> int:
        res = 0
        flag = True
        if x < 0:
            x = abs(x)
            flag = False
        while x > 0:
            rem = x % 10
            res = res * 10 + rem
            x = x // 10
        if res < -(2 **31) or res > (2**31) -1:
            return 0

        if flag == True:
            return res
        else: 
            return -res
        
    # Optimal Solution
    def reverseOptimal(self, x: int) -> int:
        res = 0
        if x < 0:
            res = int(str(x)[1:][::-1]) * -1
        else:
            res = int(str(x)[::-1])
        
        if res > 2 ** 31 - 1 or res < -2 ** 31:
            return 0
        
        return res
    
s = Solution()
num = -123
res = s.reverse(num)
print(res)
res = s.reverseOptimal(num)
print(res)